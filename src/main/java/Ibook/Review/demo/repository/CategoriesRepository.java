package Ibook.Review.demo.repository;
import Ibook.Review.demo.entity.Categories;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CategoriesRepository extends MongoRepository<Categories, Long> {
    List<Categories> findByName(String name);
    boolean existsByName(String name);
}
