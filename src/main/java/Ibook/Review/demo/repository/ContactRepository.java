package Ibook.Review.demo.repository;

import Ibook.Review.demo.entity.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, Long> {

    Contact getContacById(long i);
}
