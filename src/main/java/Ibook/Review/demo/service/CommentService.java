package Ibook.Review.demo.service;

import Ibook.Review.demo.entity.Comment;
import Ibook.Review.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.activation.DataContentHandler;
import java.util.List;

@Service
public interface CommentService {

    Page<Comment> findAllComment(Integer page, Integer size);

    Page<Comment> findAllCommentByIdBook(long idBook, Integer page, Integer size);

    void deleted(long id);

}
