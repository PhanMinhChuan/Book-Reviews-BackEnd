package Ibook.Review.demo;

import Ibook.Review.demo.CommonUtil.Status;
import Ibook.Review.demo.entity.*;
import Ibook.Review.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class IBookApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(IBookApplication.class, args);
    }

    @Autowired
    BookRepository bookRepository;

    //@Autowired
    //PasswordEncoder passwordEncoder;



    @Override
    public void run(String... args) throws Exception {
//        List<Long> idCat = new ArrayList<>();
//        idCat.add(Long.valueOf(1));
//        idCat.add(Long.valueOf(2));
//        idCat.add(Long.valueOf(3));
//        //User user = new User(1, "admin", passwordEncoder.encode("123"), null, "ROLE_ADMIN");
//        User user1 = new User(3, "minhchuan", passwordEncoder.encode("123"), idCat, "ROLE_AUTHOR");
//
//        //userRepository.save(user);
//        userRepository.save(user1);
//        Categories cat = new Categories(1, "Tình cảm");
//        Categories cat1 = new Categories(2, "Trinh thám");
//        Categories cat2 = new Categories(3, "Hành động");
//        Categories cat3 = new Categories(4, "Ma quỷ");
//        Categories cat4 = new Categories(5, "Tâm linh");
//        Categories cat5 = new Categories(6, "Du Hành");
//        Categories cat6 = new Categories(7, "Xuyên Không");
//        Categories cat7 = new Categories(8, "Học Đường");
//        categoriesRepository.save(cat);
//        categoriesRepository.save(cat1);
//        categoriesRepository.save(cat2);
//        categoriesRepository.save(cat3);
//        categoriesRepository.save(cat4);
//        categoriesRepository.save(cat5);
//        categoriesRepository.save(cat6);
//        categoriesRepository.save(cat7);
//        Comment com1 = new Comment(1, 1, 3, "Nội dung hay");
//        Comment com2 = new Comment(2, 2, 3, "Đáng xem");
//        Comment com3 = new Comment(3, 3, 3, "Thực tế với người đọc");
//        Comment com4 = new Comment(4, 5, 3, "Rất bổ ích");
//        Comment com5 = new Comment(5, 4, 3, "Xin phép được share cho mọi người");
//        Comment com6 = new Comment(6, 2, 3, "Tác giả cần tìm hiểu thêm");
//        Comment com7 = new Comment(7, 1, 3, "Sẽ xem lại nhiều lần");
//        Comment com8 = new Comment(8, 4, 3, "<3 <3 <3");
//        Comment com9 = new Comment(9, 3, 3, "Tham gia group của tớ để bàn thêm về phim");
//        Comment com10 = new Comment(10, 7, 3, "Tác giả cần tìm hiểu thêm");
//        Comment com11 = new Comment(11, 6, 3, "Sách tệ, giá cao");
//        Comment com12 = new Comment(12, 7, 3, "Tác giả cần tìm hiểu thạiêm");
//        Comment com13 = new Comment(13, 8, 3, "Nội dung lặp đi lặp l");
//        commentRepository.save(com1);
//        commentRepository.save(com2);
//        commentRepository.save(com3);
//        commentRepository.save(com4);
//        commentRepository.save(com5);
//        commentRepository.save(com6);
//        commentRepository.save(com7);
//        commentRepository.save(com8);
//        commentRepository.save(com9);
//        commentRepository.save(com10);
//        commentRepository.save(com11);
//        commentRepository.save(com12);
//        commentRepository.save(com13);
//        Contact contact = new Contact(1, "facebook.com/chuan.minh.167", "youtube.com/chuan.minh", "minhchuan.me@gmail.com", "0859743442" ,"235 trần quý khoách");
//        contactRepository.save(contact);
//
//        List<Long> idCat = new ArrayList<>();
//        idCat.add(Long.valueOf(1));
//        idCat.add(Long.valueOf(2));
//        idCat.add(Long.valueOf(3));
//        LocalDateTime now = LocalDateTime.now();
//        Author author1 = new Author(1, "Phan Minh Chuẩn", now, Status.STATUS_AUTHOR.MALE, idCat);
//        Author author2 = new Author(2, "La Hoài Trinh", now, Status.STATUS_AUTHOR.MALE, idCat);
//        Author author3 = new Author(3, "Phạm Tiến Dũng", now, Status.STATUS_AUTHOR.FEMALE, idCat);
//        Author author4 = new Author(4, "Nguyễn Tuấn Đạt", now, Status.STATUS_AUTHOR.MALE, idCat);
//        Author author5 = new Author(5, "Lê Tuấn", now, Status.STATUS_AUTHOR.MALE, idCat);
//        Author author6 = new Author(6, "Duyên Trần", now, Status.STATUS_AUTHOR.FEMALE, idCat);
//        Author author7 = new Author(7, "Thanh Xuân", now, Status.STATUS_AUTHOR.FEMALE, idCat);
//        Author author8 = new Author(8, "Trịnh Đình An", now, Status.STATUS_AUTHOR.MALE, idCat);
//        Author author9 = new Author(9, "Tuấn Tú", now, Status.STATUS_AUTHOR.MALE, idCat);
//        authorRepository.save(author1);
//        authorRepository.save(author2);
//        authorRepository.save(author3);
//        authorRepository.save(author4);
//        authorRepository.save(author5);
//        authorRepository.save(author6);
//        authorRepository.save(author7);
//        authorRepository.save(author8);
//        authorRepository.save(author9);
        Book book = new Book();
    }
}
