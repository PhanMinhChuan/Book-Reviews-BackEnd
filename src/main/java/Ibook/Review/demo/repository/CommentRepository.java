package Ibook.Review.demo.repository;

import Ibook.Review.demo.entity.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, Long> {

    List<Comment> findAllByIdBook(Long idBook);

}
