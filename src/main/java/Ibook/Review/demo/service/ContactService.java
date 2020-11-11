package Ibook.Review.demo.service;

import Ibook.Review.demo.entity.Contact;
import org.springframework.stereotype.Service;

@Service
public interface ContactService {
    Contact getContact();

    void getUpdate(Contact contact);
}
