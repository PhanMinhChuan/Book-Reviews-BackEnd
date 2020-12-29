package Ibook.Review.demo.repository;

import Ibook.Review.demo.entity.Book;
import Ibook.Review.demo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);

    User findById(long id);

    //List<User> findAll(Pageable pageable);

    //List<User> findAllUser();

    //User findUserById(long id);
}
