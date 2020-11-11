package Ibook.Review.demo.repository;

import Ibook.Review.demo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);

    User findById(long id);
    //List<User> findAll(Pageable pageable);

    //List<User> findAllUser();

    //User findUserById(long id);
}
