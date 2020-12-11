package Ibook.Review.demo.service;

import Ibook.Review.demo.entity.Author;
import Ibook.Review.demo.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.activation.DataContentHandler;
import java.util.List;

@Service
public interface BookService {
    public List<Book> getAllBooks();

    public Book getBook(long id);

    public void addBook(Book book);

    public boolean updateBook(long id, Book book);

    public boolean deleteBook(long id);

    Page<Book> findAllBook(Integer page, Integer size);

    void UpdateStatusBookById(long id);
}
