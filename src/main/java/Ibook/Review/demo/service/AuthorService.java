package Ibook.Review.demo.service;

import Ibook.Review.demo.entity.Author;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.activation.DataContentHandler;
import java.util.List;

@Service
public interface AuthorService {
    Page<Author> findAllAuthor(Integer page, Integer size);

    void createAuthor(Author author);

    void update(long id, Author author);

    void remove(long id);

    List<Author> getAllAuthor();
}
