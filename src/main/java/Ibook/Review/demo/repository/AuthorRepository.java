package Ibook.Review.demo.repository;

import Ibook.Review.demo.entity.Author;
import Ibook.Review.demo.entity.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, Long> {
    Author findAllById(long id);
}
