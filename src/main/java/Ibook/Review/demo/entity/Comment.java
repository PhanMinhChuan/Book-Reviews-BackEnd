package Ibook.Review.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


@Document(collection = "comment")
public class Comment {
    @Id
    private long id;

    @Field(value = "book")
    @DBRef
    private Book book;

    @Field(value = "user")
    @DBRef
    private User user;

    @Field(value = "comment")
    private String comment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comment() {
        super();
    }

    public Comment (long id, Book book, User user, String comment) {
        super();
        this.id = id;
        this.book = book;
        this.user = user;
        this.comment = comment;
    }




}
