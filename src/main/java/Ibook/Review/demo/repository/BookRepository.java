package Ibook.Review.demo.repository;

import Ibook.Review.demo.entity.Book;
import Ibook.Review.demo.entity.Categories;
import Ibook.Review.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, Long> {
    @Query("{'author':{'$ref':'author','$id':?0}}")
    List<Book> findByAuthorId(long id);

    @Query("{'status' : 'APPROVED'}")
    Page<Book> findByStatusBook(Pageable pageable);

    @Query(value="{'cats.$id': ?0, 'status': ?1}")
    Page<Book> findBookByCategoryById(long id, String status, Pageable pageable);
}
