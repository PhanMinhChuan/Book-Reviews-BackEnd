package Ibook.Review.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "categories")
public class Categories {

    @Id
    private long id;

    @Field(value = "name")
    private String name;

    public Categories(long id, String name){
        this.id = id;
        this.name = name;
    }

    public Categories() {
    }

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
}
