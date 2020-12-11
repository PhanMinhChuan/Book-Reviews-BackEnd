package Ibook.Review.demo.service.impl;

import Ibook.Review.demo.CommonUtil.Status;
import Ibook.Review.demo.entity.Author;
import Ibook.Review.demo.entity.Book;
import Ibook.Review.demo.repository.BookRepository;
import Ibook.Review.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    public void addBook(Book book) {
        book.setId(bookRepository.findAll().get(bookRepository.findAll().size() - 1).getId() + 1);
        bookRepository.save(book);
    }

    @Override
    public boolean updateBook(long id, Book book) {
        Book bookEx = bookRepository.findById(id).get();
        bookEx.setAuthors(book.getAuthors());
        bookEx.setCategories(book.getCategories());
        bookEx.setDescription(book.getDescription());
        bookEx.setDetail(book.getDetail());
        bookEx.setImage(book.getImage());
        bookEx.setName(bookEx.getName());
        bookEx.setStatusBook(Status.STATUS_BOOK.UNAPPROVED);
        bookRepository.save(bookEx);
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

    @Override
    public Page<Book> findAllBook(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return (Page<Book>) bookRepository.findAll(pageable);
    }

    @Override
    public void UpdateStatusBookById(long id) {
        Book book = bookRepository.findById(id).get();
        if (book.getStatusBook() == Status.STATUS_BOOK.APPROVED) {
            book.setStatusBook(Status.STATUS_BOOK.UNAPPROVED);
        } else {
            book.setStatusBook(Status.STATUS_BOOK.APPROVED);
        }
        bookRepository.save(book);
    }


}
