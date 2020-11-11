package Ibook.Review.demo.controller;

import Ibook.Review.demo.entity.Book;
import Ibook.Review.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBook(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id){
        return bookService.getBook(id);
    }

    @PostMapping
    public boolean addBook(@RequestBody @Valid Book book){
        return bookService.addBook(book);
    }

    @PutMapping
    public boolean updateBook(@RequestBody @Valid Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public boolean deleteBoom(@PathVariable long id){
        return bookService.deleteBook(id);
    }
}
