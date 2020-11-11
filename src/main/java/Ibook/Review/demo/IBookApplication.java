package Ibook.Review.demo;

import Ibook.Review.demo.CommonUtil.Status;
import Ibook.Review.demo.entity.Author;
import Ibook.Review.demo.entity.Comment;
import Ibook.Review.demo.entity.Contact;
import Ibook.Review.demo.entity.User;
import Ibook.Review.demo.repository.AuthorRepository;
import Ibook.Review.demo.repository.CommentRepository;
import Ibook.Review.demo.repository.ContactRepository;
import Ibook.Review.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class IBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(IBookApplication.class, args);
    }

//    @Autowired
//    AuthorRepository authorRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Author author = new Author(1, "Phan Minh Chuan",null,  Status.STATUS_AUTHOR.FEMALE, null);
//        authorRepository.save(author);
//    }
}
