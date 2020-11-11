package Ibook.Review.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document
public class Book {

    @Indexed
    @Id
    private long id;

    @Field
    private String name;

    @Field("idCat")
    private List<Long> idCategories;

    @Field("idAuthor")
    private List<Long> idAuthor;

    @Field("description")
    private String description;

    @Field("detail")
    private String detail;

    @Field("image")
    private String image;

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

    public List<Long> getIdCategories() {
        return idCategories;
    }

    public void setIdCategories(List<Long> idCategories) {
        this.idCategories = idCategories;
    }

    public List<Long> getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(List<Long> idAuthor) {
        this.idAuthor = idAuthor;
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
}