package Ibook.Review.demo.repository;
import Ibook.Review.demo.entity.Categories;
import Ibook.Review.demo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CategoriesRepository extends MongoRepository<Categories, Long> {

    List<Categories> findByName(String name);

    boolean existsByName(String name);

    //Categories findById(long id);
}
