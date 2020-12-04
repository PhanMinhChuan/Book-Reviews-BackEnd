package Ibook.Review.demo.entity;

import Ibook.Review.demo.CommonUtil.Status;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "book")
public class Book {

    //@Indexed
    @Id
    private long id;

    @Field("name")
    private String name;

    @Field("cats")
    @DBRef
    private List<Categories> cats;

    @Field("authors")
    @DBRef
    private Author authors;

    @Field("description")
    private String description;

    @Field("detail")
    private String detail;

    @Field("image")
    private String image;

    @Field("status")
    private Status.STATUS_BOOK statusBook;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Categories> getCategories() {
        return cats;
    }

    public void setCategories(List<Categories> cats) {
        this.cats = cats;
    }

    public Author getAuthors() {
        return authors;
    }

    public void setAuthors(Author authors) {
        this.authors = authors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Status.STATUS_BOOK getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(Status.STATUS_BOOK statusBook) {
        this.statusBook = statusBook;
    }

    public Book () {
        super();
    }

    public Book (long id, String name, List<Categories> cats, Author authors, String description, String detail, String image, Status.STATUS_BOOK statusBook) {
        this.id = id;
        this.name = name;
        this.cats = cats;
        this.authors = authors;
        this.description = description;
        this.detail = detail;
        this.image = image;
        this.statusBook = statusBook;
    }
}