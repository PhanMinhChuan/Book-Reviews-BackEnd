package Ibook.Review.demo.controller;

import Ibook.Review.demo.CommonUtil.Const;
import Ibook.Review.demo.entity.Contact;
import Ibook.Review.demo.entity.User;
import Ibook.Review.demo.service.ContactService;
import Ibook.Review.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("contacts")
@CrossOrigin
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping(consumes = "application/json")
    @PreAuthorize("hasAnyRole('ADMIN, USER')")
    public ResponseEntity<Contact> getContact() {
        Contact contact = contactService.getContact();
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> UpdateContact(@RequestBody @Valid Contact contact) {
        contactService.getUpdate(contact);
        return new ResponseEntity<>( HttpStatus.OK);
    }

}