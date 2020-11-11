package Ibook.Review.demo.service.impl;

import Ibook.Review.demo.entity.Contact;
import Ibook.Review.demo.repository.ContactRepository;
import Ibook.Review.demo.service.CommentService;
import Ibook.Review.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactRepository contactRepository;

    @Override
    public Contact getContact() {
        long i =1;
        return contactRepository.getContacById(i);
    }

    @Override
    public void getUpdate(Contact contact) {
        Contact contactEx = contactRepository.getContacById(1);
        contactEx.setYoutube(contact.getYoutube());
        contactEx.setPhoneNumber(contact.getPhoneNumber());
        contactEx.setGmail(contact.getGmail());;
        contactEx.setAddress(contact.getAddress());
        contactEx.setFacebook(contact.getFacebook());

        contactRepository.save(contactEx);
    }
}
