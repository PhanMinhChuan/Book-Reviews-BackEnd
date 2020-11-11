package Ibook.Review.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


@Document(collection = "comment")
public class Comment {
    @Id
    private long id;

    @Field(value = "idBook")
    private long idBook;

    @Field(value = "idUser")
    private long idUser;

    @Field(value = "comment")
    private String comment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdIdBook(long idBook) {
        this.idBook = idBook;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getComment() {
        return comment;
    }

    public void setIdIdUser(String comment) {
        this.comment = comment;
    }

    public Comment() {
        super();
    }

    public Comment (long id, long idBook, long idUser, String comment) {
        super();
        this.id = id;
        this.idBook = idBook;
        this.idUser = idUser;
        this.comment = comment;
    }




}
