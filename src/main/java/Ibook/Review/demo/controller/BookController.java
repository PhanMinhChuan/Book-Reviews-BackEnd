package Ibook.Review.demo.controller;

import Ibook.Review.demo.CommonUtil.Const;
import Ibook.Review.demo.entity.Author;
import Ibook.Review.demo.entity.Book;
import Ibook.Review.demo.repository.CategoriesRepository;
import Ibook.Review.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("books")
@CrossOrigin
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(consumes = "application/json")
    @PreAuthorize("hasAnyRole('ADMIN, USER')")
    public ResponseEntity<List<Book>> findAllBook(@RequestParam(value="page", defaultValue = Const.NUMBER_PAGE_START_DEFAULT) Integer page,
                                                  @RequestParam(value="size", defaultValue = Const.NUMBER_SIZE_PAGE_DEFAULT) Integer size) {
        return new ResponseEntity<>(bookService.findAllBook(page, size).getContent(), HttpStatus.OK);
    }

    @GetMapping("/user")
    @PreAuthorize("hasAnyRole('ADMIN, USER')")
    public ResponseEntity<List<Book>> findAllBookForUser(@RequestParam(value="page", defaultValue = Const.NUMBER_PAGE_START_DEFAULT) Integer page,
                                                  @RequestParam(value="size", defaultValue = Const.NUMBER_SIZE_PAGE_DEFAULT) Integer size) {
        return new ResponseEntity<>(bookService.getBookForUser(page, size).getContent(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN, USER')")
    public Book getBookById(@PathVariable long id){
        return bookService.getBook(id);
    }

    @PostMapping("/{id}")
    public void UpdateStatusBookById(@PathVariable long id){
        bookService.UpdateStatusBookById(id);
    }

    @PostMapping
    public void addBook(@RequestBody @Valid Book book){
        bookService.addBook(book);
    }

    @PutMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<Book> getAllBook(){
        return bookService.getAllBooks();
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void updateBook(@PathVariable Long id, @RequestBody @Valid Book book){
        bookService.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean deleteBoom(@PathVariable long id){
        return bookService.deleteBook(id);
    }
}
