package Ibook.Review.demo.service;

import Ibook.Review.demo.entity.FruitWrapper;
import Ibook.Review.demo.entity.User;
import Ibook.Review.demo.entity.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    Page<User> findAllUser(Integer page, Integer size);

    User getUserById(long id);

    void update(long id, FruitWrapper bookName);

    void update(UserDTO user);

    void remove(long id);

    void createUser(User user);

    List<User> getAllUser();
}
