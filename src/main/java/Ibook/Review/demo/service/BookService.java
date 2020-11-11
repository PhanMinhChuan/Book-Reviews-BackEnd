package Ibook.Review.demo.service;

import Ibook.Review.demo.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    public List<Book> getAllBooks();

    public Book getBook(long id);

    public boolean addBook(Book book);

    public boolean updateBook(Book book);

    public boolean deleteBook(long id);
}
