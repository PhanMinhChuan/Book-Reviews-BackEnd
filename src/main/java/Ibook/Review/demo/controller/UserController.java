package Ibook.Review.demo.controller;

import Ibook.Review.demo.CommonUtil.Const;
import Ibook.Review.demo.entity.CustomUserDetails;
import Ibook.Review.demo.entity.User;
import Ibook.Review.demo.jwt.JwtTokenProvider;
import Ibook.Review.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("users")
@CrossOrigin
public class UserController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider tokenProvider;

    @Autowired
    UserService userService;

    @GetMapping(consumes = "application/json")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<User>> findAllUser(@RequestParam(value="page", defaultValue = Const.NUMBER_PAGE_START_DEFAULT) Integer page,
                                                  @RequestParam(value="size", defaultValue = Const.NUMBER_SIZE_PAGE_DEFAULT) Integer size) {
        return new ResponseEntity<>(userService.findAllUser(page, size).getContent(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public User getUsernameById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> createUser(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(path = "/login", consumes = "application/json")
    public String authenticateUser(@Valid @RequestBody User user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getUsername(),
                        user.getPassword()
                )
        );

        String jwt = tokenProvider.generateToken((CustomUserDetails) authentication.getPrincipal());
        return jwt;
    }

    @PutMapping("{id}")
    @PreAuthorize("hasRole('ADMIN') and hasRole('STAFF')")
    public ResponseEntity<Void> updateUser(@PathVariable Integer id, @RequestBody User userUpdate) {
        userService.update(id, userUpdate);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> removeUser(@PathVariable Integer id) {
        userService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}