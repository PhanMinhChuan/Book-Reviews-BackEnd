package Ibook.Review.demo.service.impl;

import Ibook.Review.demo.entity.Comment;
import Ibook.Review.demo.entity.User;
import Ibook.Review.demo.repository.CommentRepository;
import Ibook.Review.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Override
    public Page<Comment> findAllComment(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return (Page<Comment>) commentRepository.findAll(pageable);
    }

    @Override
    public void deleted(long id) {
        commentRepository.deleteById(id);
    }
}
