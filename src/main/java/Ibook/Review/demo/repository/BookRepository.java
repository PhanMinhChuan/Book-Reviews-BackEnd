package Ibook.Review.demo.repository;

import Ibook.Review.demo.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Long> {
}
