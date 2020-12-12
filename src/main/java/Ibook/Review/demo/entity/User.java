package Ibook.Review.demo.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "user")
public class User {
    @Id
    private long id;

    @Field(value = "username")
    //@Column(name = "username", length = 32, nullable = false)
    private String username;

    @Field(value = "name")
    private String name;

    @Field(value = "email")
    private String email;

    @Field(value = "password")
    //@Column(name = "password", length = 100, nullable = false)
    private String password;

    @Field(value = "books")
    @DBRef
    private List<Book> books;

    @Field(value = "role")
    private String role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(long id, String username, String name, String email, String password, List<Book> books, String role) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
        this.books = books;
        this.role = role;
    }

    public User(long id, String username, String password, List<Book> books, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.books = books;
        this.role = role;
    }

    public User() {
    }
}
