package Ibook.Review.demo.controller;

import Ibook.Review.demo.CommonUtil.Const;
import Ibook.Review.demo.entity.Comment;
import Ibook.Review.demo.entity.User;
import Ibook.Review.demo.repository.CommentRepository;
import Ibook.Review.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("comments")
@CrossOrigin
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping(consumes = "application/json")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Comment>> findAllComment(@RequestParam(value="page", defaultValue = Const.NUMBER_PAGE_START_DEFAULT) Integer page,
                                                        @RequestParam(value="size", defaultValue = Const.NUMBER_SIZE_PAGE_DEFAULT) Integer size) {
        return new ResponseEntity<>(commentService.findAllComment(page, size).getContent(), HttpStatus.OK);
    }

    @DeleteMapping(path = "{/id}", consumes = "application/json")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> deletedComment(@PathVariable long id ) {
        commentService.deleted(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}