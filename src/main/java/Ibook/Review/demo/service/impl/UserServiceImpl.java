package Ibook.Review.demo.service.impl;

import Ibook.Review.demo.entity.Book;
import Ibook.Review.demo.entity.CustomUserDetails;
import Ibook.Review.demo.entity.FruitWrapper;
import Ibook.Review.demo.entity.User;
import Ibook.Review.demo.repository.BookRepository;
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

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public Page<User> findAllUser(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return (Page<User>) userRepository.findAll(pageable);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void update(long id, FruitWrapper bookName) {
        for (int i = 0; i < bookName.getSize(); i++) {
            System.out.println(bookName.getIcon(i));
        }
        User user = userRepository.findById(id);
        user.setBooks(null);
        List<Book> findALLBook = bookRepository.findAll();
        List<Book> findALlBookByName = new ArrayList<>();
        for (int i = 0; i < findALLBook.size(); i++) {
            for (int j = 0; j < bookName.getSize(); j++) {
                if(findALLBook.get(i).getName().equals(bookName.getIcon(j))) {
                    findALlBookByName.add(findALLBook.get(i));
                }
            }
        }
        user.setBooks(findALlBookByName);
        //if (user.getBooks().size() > bookName.getSize()) {
        //    int nokori = bookName.getSize() - user.getBooks().size();

        //}
        userRepository.save(user);
    }

//    @Override
//    public void update(long id, User userUpdate) {
//        User user = userRepository.findById(id);
//        user.setPassword(userUpdate.getPassword());
//        user.setBooks(userUpdate.getBooks());
//        userRepository.save(user);
//    }

    @Override
    public void remove(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void createUser(User user) {
        if (user.getUsername() != null && user.getPassword() != null) {
            User userEx = new User();
            userEx.setId(userRepository.findAll().get(userRepository.findAll().size() - 1).getId() + 1);
            userEx.setUsername(user.getUsername());
            userEx.setPassword(passwordEncoder.encode(user.getPassword()));
            userEx.setBooks(user.getBooks());
            userEx.setRole("ROLE_USER");
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
