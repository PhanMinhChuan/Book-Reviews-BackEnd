package Ibook.Review.demo.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "contact")
public class Contact {
    @Id
    private long id;

    @Field(value = "facebook")
    //@Column(name = "username", length = 32, nullable = false)
    private String facebook;

    @Field(value = "youtube")
    //@Column(name = "password", length = 100, nullable = false)
    private String youtube;

    @Field(value = "gmail")
    private String gmail;

    @Field(value = "phoneNumber")
    private String phoneNumber;

    @Field(value = "address")
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.facebook = facebook;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Contact(long id, String facebook, String youtube, String gmail, String phoneNumber, String address) {
        this.id = id;
        this.facebook = facebook;
        this.youtube = youtube;
        this.gmail = gmail;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Contact() {
    }
}
