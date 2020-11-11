package Ibook.Review.demo.service;

import Ibook.Review.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    Page<User> findAllUser(Integer page, Integer size);

    User getUserById(long id);

    void update(long id, User userUpdate);

    void remove(long id);

    void createUser(User user);
}
