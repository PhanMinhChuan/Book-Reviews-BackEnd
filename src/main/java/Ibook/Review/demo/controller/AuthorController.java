package Ibook.Review.demo.controller;

import Ibook.Review.demo.CommonUtil.Const;
import Ibook.Review.demo.entity.Author;
import Ibook.Review.demo.entity.Book;
import Ibook.Review.demo.entity.Comment;
import Ibook.Review.demo.entity.User;
import Ibook.Review.demo.service.AuthorService;
import Ibook.Review.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("authors")
@CrossOrigin
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping(consumes = "application/json")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Author>> findAllAuthor(@RequestParam(value="page", defaultValue = Const.NUMBER_PAGE_START_DEFAULT) Integer page,
                                                      @RequestParam(value="size", defaultValue = Const.NUMBER_SIZE_PAGE_DEFAULT) Integer size) {
        return new ResponseEntity<>(authorService.findAllAuthor(page, size).getContent(), HttpStatus.OK);
    }

    @GetMapping("/{id}/books")
    public List<Book> getBookByAuthorId(@PathVariable long id){
        return authorService.getBookByAuthor(id);
    }

    @GetMapping("/{id}")
    public Author geAuthorById(@PathVariable long id){
        return authorService.findAuthorById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> createUser(@RequestBody Author author){
        authorService.createAuthor(author);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> updateUser(@PathVariable long id, @RequestBody Author author) {
        authorService.update(id, author);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Author>> findAllAuthor() {
        return new ResponseEntity<>(authorService.getAllAuthor(), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> removeAuthor(@PathVariable long id) {
        authorService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}