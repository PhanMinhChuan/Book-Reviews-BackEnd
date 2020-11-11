package Ibook.Review.demo.repository;

import Ibook.Review.demo.entity.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, Long> {
}
