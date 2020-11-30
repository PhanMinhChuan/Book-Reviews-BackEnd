package Ibook.Review.demo.entity;

import Ibook.Review.demo.CommonUtil.Status;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.List;


@Document(collection = "author")
public class Author {

    @Id
    private long id;

    @Field(value = "name")
    private String name;

    @Field(value = "birth")
    private LocalDateTime birth;

    @Field(value = "sex")
    private Status.STATUS_AUTHOR sex;

    @Field(value = "idCat")
    private List<Long> idCat;

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

    public LocalDateTime getBrith() {
        return birth;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }

    public Status.STATUS_AUTHOR getSex() {
        return sex;
    }

    public void setSex(Status.STATUS_AUTHOR sex) {
        this.sex = sex;
    }

    public List<Long> getIdCat() {
        return idCat;
    }

    public void setIdCat(List<Long> idCat) {
        this.idCat = idCat;
    }

    public Author() {
        super();
    }

    public Author(long id, String name, LocalDateTime birth, Status.STATUS_AUTHOR sex, List<Long> idCat) {
        super();
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
        this.idCat = idCat;
    }

}
