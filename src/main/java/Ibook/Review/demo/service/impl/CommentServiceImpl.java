package Ibook.Review.demo.service.impl;

import Ibook.Review.demo.entity.Comment;
import Ibook.Review.demo.entity.User;
import Ibook.Review.demo.repository.CommentRepository;
import Ibook.Review.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public Page<Comment> findAllCommentByIdBook(long idBook, Integer page, Integer size) {
        List<Comment> listComment = commentRepository.findAll();
        List<Comment> listCommentNew = new ArrayList<>();
        for (Comment item : listComment) {
            if (item.getBook().getId() == idBook) {
                listCommentNew.add(item);
            }
        }

        System.out.println(listCommentNew.size());

        Pageable pageable = PageRequest.of(page, size);
        int total = listCommentNew.size();
        int start = Math.toIntExact(pageable.getOffset());
        int end = Math.min((start + pageable.getPageSize()), total);

        List<Comment> output = new ArrayList<>();
        if (start <= end) {
            output = listCommentNew.subList(start, end);
        }

        return new PageImpl<>(
                output,
                pageable,
                total
        );
    }

    @Override
    public void deleted(long id) {
        commentRepository.deleteById(id);
    }

}
