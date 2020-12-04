package Ibook.Review.demo.service.impl;

import Ibook.Review.demo.entity.Author;
import Ibook.Review.demo.entity.Comment;
import Ibook.Review.demo.repository.AuthorRepository;
import Ibook.Review.demo.repository.CommentRepository;
import Ibook.Review.demo.service.AuthorService;
import Ibook.Review.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Page<Author> findAllAuthor(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return (Page<Author>) authorRepository.findAll(pageable);
    }

    @Override
    public void createAuthor(Author author) {
        long id = authorRepository.findAll().size();
        author.setId(id);
        authorRepository.save(author);
    }

    @Override
    public void update(long id, Author author) {
        Author authorEx = authorRepository.findAllById(id);
        authorEx.setName(author.getName());
        authorEx.setSex(author.getSex());
        authorEx.setBirth(author.getBrith());
        authorEx.setCategories(author.getCategories());

        authorRepository.save(authorEx);
    }

    @Override
    public void remove(long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }
}
