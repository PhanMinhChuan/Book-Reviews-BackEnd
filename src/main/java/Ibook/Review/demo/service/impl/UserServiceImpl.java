package Ibook.Review.demo.service.impl;

import Ibook.Review.demo.entity.CustomUserDetails;
import Ibook.Review.demo.entity.User;
import Ibook.Review.demo.repository.UserRepository;
import Ibook.Review.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public Page<User> findAllUser(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return (Page<User>) userRepository.findAll(pageable);
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void update(long id, User userUpdate) {
        User user = userRepository.findById(id);
        user.setPassword(userUpdate.getPassword());
        user.setIdJob(userUpdate.getIdJob());
        userRepository.save(user);
    }

    @Override
    public void remove(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void createUser(User user) {
        if (user.getUsername() != null && user.getPassword() != null) {
            User userEx = new User();
            userEx.setUsername(user.getUsername());
            userEx.setPassword(passwordEncoder.encode(user.getPassword()));
            userEx.setIdJob(user.getIdJob());
            userEx.setRole("ROLE_STAFF");
            userRepository.save(userEx);
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserDetails(user.getId(), user.getUsername(), user.getPassword(), user.getRole());
    }

    @Transactional
    public UserDetails loadUserById(int id) {
        User user = userRepository.findById(id);
         return new CustomUserDetails(user.getId(), user.getUsername(), user.getPassword(), user.getRole());
    }

}
