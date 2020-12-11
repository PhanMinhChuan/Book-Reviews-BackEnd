package Ibook.Review.demo.repository;

import Ibook.Review.demo.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, Long> {
    @Query("{'author':{'$ref':'author','$id':?0}}")
    List<Book> findByAuthorId(long id);
}
