package Ibook.Review.demo.service.impl;

import Ibook.Review.demo.entity.Book;
import Ibook.Review.demo.repository.BookRepository;
import Ibook.Review.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImlp implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public boolean addBook(Book book) {
        try {
            book.setId(bookRepository.count());
            bookRepository.save(book);
        }catch(Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean updateBook(Book book) {
        try {
            if (bookRepository.existsById(book.getId())) {
                bookRepository.insert(book);
            } else return false;
        }catch(Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteBook(long id) {
        try {
            if (bookRepository.existsById(id)) {
                bookRepository.deleteById(id);
            } else return false;
        }catch (Exception e){
            return false;
        }
        return true;
    }


}
