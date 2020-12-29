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

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    @Autowired
    CategoriesRepository categoriesRepository;

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    ContactRepository contactRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public void run(String... args) throws Exception {
//        List<Long> idCat = new ArrayList<>();
//        idCat.add(Long.valueOf(1));
//        idCat.add(Long.valueOf(2));
//        idCat.add(Long.valueOf(3));
//        User user = new User(1, "admin", passwordEncoder.encode("123"), null, "ROLE_ADMIN");
//        User user1 = new User(3, "minhchuan", passwordEncoder.encode("123"), null, "ROLE_AUTHOR");
//
//        userRepository.save(user);
//        userRepository.save(user1);

//        List<Author> listAuthor1 = new ArrayList<>();
//        listAuthor1.add(author2);listAuthor1.add(author3);listAuthor1.add(author4);
//        List<Author> listAuthor2 = new ArrayList<>();
//        listAuthor1.add(author3);listAuthor1.add(author5);
//        List<Author> listAuthor3 = new ArrayList<>();
//        listAuthor1.add(author7);listAuthor1.add(author3);listAuthor1.add(author4);
//        List<Author> listAuthor1 = new ArrayList<>();
//        listAuthor1.add(author2);listAuthor1.add(author3);listAuthor1.add(author4);
//        List<Author> listAuthor1 = new ArrayList<>();
//        listAuthor1.add(author2);listAuthor1.add(author3);listAuthor1.add(author4);
//        List<Author> listAuthor1 = new ArrayList<>();
//        listAuthor1.add(author2);listAuthor1.add(author3);listAuthor1.add(author4);
//        List<Author> listAuthor1 = new ArrayList<>();
//        listAuthor1.add(author2);listAuthor1.add(author3);listAuthor1.add(author4);
//        Categories categories1 = categoriesRepository.findById(Long.valueOf(2)).get();
//        categories1.setName("jhgghgj");
//        Categories cat12 = categoriesRepository.save(categories1);
//        Categories cat22 = categoriesRepository.findById(Long.valueOf(5)).get();
//
//        Author author= authorRepository.findById(Long.valueOf(1)).get();
//        author.getCategory().get(0).setId(Long.valueOf(6));
//        authorRepository.save(author);
//        List<Categories> categories = new ArrayList<>();
//        categories.add(cat12);
//        categories.add(cat22);
//
//        Book book = new Book();
//        User user = userRepository.findById(1);
//        for (int i = 0; i <= user.getBooks().size(); i++) {
//            user.getBooks().get(i).setId(1);
//        }//
//        userRepository.save(user);
//---------------------------------------------------------------------------------------------------------------------------------------
//        Categories cat = new Categories(1, "Tình cảm");
//        Categories cat1 = new Categories(2, "Trinh thám");
//        Categories cat2 = new Categories(3, "Hành động");
//        Categories cat3 = new Categories(4, "Ma quỷ");
//        Categories cat4 = new Categories(5, "Tâm linh");
//        Categories cat5 = new Categories(6, "Du Hành");
//        Categories cat6 = new Categories(7, "Xuyên Không");
//        Categories cat7 = new Categories(8, "Học Đường");
//        Categories cat8 = new Categories(9, "asdn");
//        categoriesRepository.save(cat);
//        categoriesRepository.save(cat1);
//        categoriesRepository.save(cat2);
//        categoriesRepository.save(cat3);
//        categoriesRepository.save(cat4);
//        categoriesRepository.save(cat5);
//        categoriesRepository.save(cat6);
//        categoriesRepository.save(cat7);
//        categoriesRepository.save(cat8);
//
//        LocalDateTime now = LocalDateTime.now();
//        List<Categories> list = new ArrayList<>();
//        list.add(cat);list.add(cat1);list.add(cat2);list.add(cat4);
//        List<Categories> list1 = new ArrayList<>();
//        list1.add(cat3);list1.add(cat4);list1.add(cat6);list1.add(cat7);
//        List<Categories> list2 = new ArrayList<>();
//        list2.add(cat2);list2.add(cat5);list2.add(cat3);
//        List<Categories> list3 = new ArrayList<>();
//        list3.add(cat4);list3.add(cat7);
//        List<Categories> list4 = new ArrayList<>();
//        list4.add(cat3);list.add(cat4);list4.add(cat5);list4.add(cat6);
//        List<Categories> list5 = new ArrayList<>();
//        list5.add(cat);list5.add(cat1);list5.add(cat2);list5.add(cat4);list5.add(cat7);
//
//        Author author1 = new Author(1, "Nguyễn Nhật Ánh", now, Status.STATUS_AUTHOR.MALE, list, "Việt Nam", "https://toplist.vn/images/800px/nha-van-noi-tieng-nhat-viet-nam-16394.jpg");
//        Author author2 = new Author(2, "Trang Hạ", now, Status.STATUS_AUTHOR.MALE, list3, "Việt Nam", "https://toplist.vn/images/800px/trang-ha-557105.jpg");
//        Author author3 = new Author(3, "Nguyễn Phong Việt", now, Status.STATUS_AUTHOR.FEMALE, list2, "Việt Nam", "https://toplist.vn/images/800px/nha-van-noi-tieng-nhat-viet-nam-16391.jpg");
//        Author author4 = new Author(4, "Anh Khang", now, Status.STATUS_AUTHOR.MALE, list5,"Việt Nam", "https://toplist.vn/images/800px/anh-khang-299076.jpg");
//        Author author5 = new Author(5, "Nguyễn Ngọc Thạch", now, Status.STATUS_AUTHOR.MALE, list4,"Việt Nam", "https://toplist.vn/images/800px/nguyen-ngoc-thach-557115.jpg");
//        Author author6 = new Author(6, "Hamlet Trương", now, Status.STATUS_AUTHOR.FEMALE, list3,"Việt Nam", "https://toplist.vn/images/800px/hamlet-truong-557128.jpg");
//        Author author7 = new Author(7, "Đỗ Nhật Nam", now, Status.STATUS_AUTHOR.FEMALE, list5,"Việt Nam", "https://toplist.vn/images/800px/do-nhat-nam-557124.jpg");
//        Author author8 = new Author(8, "Nguyễn Ngọc Sơn (Sơn Paris)", now, Status.STATUS_AUTHOR.MALE, list1,"Việt Nam", "https://toplist.vn/images/800px/nha-van-noi-tieng-nhat-viet-nam-16392.jpg");
//        authorRepository.save(author1);
//        authorRepository.save(author2);
//        authorRepository.save(author3);
//        authorRepository.save(author4);
//        authorRepository.save(author5);
//        authorRepository.save(author6);
//        authorRepository.save(author7);
//        authorRepository.save(author8);
//
//        Contact contact = new Contact(1, "facebook.com/chuan.minh.167", "youtube.com/chuan.minh", "minhchuan.me@gmail.com", "0859743442" ,"235 trần quý khoách");
//        contactRepository.save(contact);
//
//        Book book1 = new Book(1, "Clean Code: A Handbook of Agile Software Craftsmanship", list1, author2,
//                "Even bad code can function. But if code isn’t clean, it can bring a development organization to its knees. " +
//                        "Every year, countless hours and significant resources are lost because of poorly written code. But it doesn’t have to be that way.",
//                "<p>Noted software expert Robert C. Martin presents a revolutionary paradigm with Clean Code: A Handbook of Agile Software Craftsmanship . " +
//                        "Martin has teamed up with his colleagues from Object Mentor to distill their best agile practice of cleaning code &ldquo;on the fly&rdquo; into a book that will instill within you the values of a software craftsman and make you a better programmer&mdash" +
//                        ";but only if you work at it. What kind of work will you be doing? You&rsquo;ll be reading code&mdash;lots of code. And you will be challenged to think about what&rsquo;s right about that code, and what&rsquo;s wrong with it. More importantly, you will be challenged to reassess your professional values and your commitment to your craft. Clean Code is divided into three parts. The first describes the principles, patterns, and practices of writing clean code. The second part consists of several case studies of increasing complexity. Each case study is an exercise in cleaning up code&mdash;of transforming a code base that has some problems into one that is sound and efficient. The third part is the payoff: a single chapter containing a list of heuristics and &ldquo;smells&rdquo; gathered while creating the case studies. The result is a knowledge base that describes the way we think when we write, read, and clean code. Reade" +
//                        "rs will come away from this book understanding H" +
//                        "ow to tell the difference between good and bad code How to write good code and how to transform bad code into good code How to create good names, good functions, good objects, and good classes How to format code for maximum readability How to implement complete error handling without obscuring code logic How to unit test and practice test-driven development This book is a must for any developer, software engineer, project manager, team lead, or systems analyst with an interest in producing better code.</p>",
//                "https://salt.tikicdn.com/cache/w1200/ts/product/5f/d7/35/d6a086d2450d364198cd07ebef63d8a7.jpg", Status.STATUS_BOOK.APPROVED);
//
//        Book book2 = new Book(2, "Ebook Head First Java 2nd Edition", list1, author2, "Learning a complex new language is no easy task especially when it s an object-oriented computer programming language like Java. You might think the problem is your brain. It seems to have a mind of its own, a mind that doesn't always want to take in the dry, technical stuff you're forced to study.",
//                "<p>The fact is your brain craves novelty. It&#39;s constantly searching, scanning, waiting for something unusual to happen. After all, that&#39;s the way it was built to help you stay alive. It takes all the routine, ordinary, dull stuff and filters it to the background so it won&#39;t interfere with your brain&#39;s real work--recording things that matter. How does your brain know what matters? It&#39;s like the creators of the Head First approach say, suppose you&#39;re out for a hike and a tiger jumps in front of you, what happens in your brain? Neurons fire. Emotions crank up. Chemicals surge. That&#39;s how your brain knows. And that&#39;s how your brain will learn Java. Head First Java combines puzzles, strong visuals, mysteries, and soul-searching interviews with famous Java objects to engage you in many different ways. It&#39;s fast, it&#39;s fun, and it&#39;s effective. And, despite its playful appearance, Head First Java is serious stuff: a complete introduction to object-oriented programming and Java. You&#39;ll learn everything from the fundamentals to advanced topics, including threads, network sockets, and distributed programming with RMI. And the new. second edition focuses on Java 5.0, the latest version of the Java language and development platform. Because Java 5.0 is a major update to the platform, with deep, code-level changes, even more careful study and implementation is required. So learning the Head First way is more important than ever. If you&#39;ve read a Head First book, you know what to expect--a visually rich format designed for the way your brain works. If you haven&#39;t, you&#39;re in for a treat. You&#39;ll see why people say it&#39;s unlike any other Java book you&#39;ve ever read. By exploiting how your brain works, Head First Java compresses the time it takes to learn and retain--complex information. Its unique approach not only shows you what you need to know about Java syntax, it teaches you to think like a Java programmer. If you want to be bored, buy some other book. But if you want to understand Java, this book&#39;s for you.</p>\n",
//                "https://3.bp.blogspot.com/-eVjpcy1uhqg/WLXZwE9kq5I/AAAAAAAAAaI/eKdxic-GNlwY_qjekitGfNKH9BnOKl0ewCLcB/s1600/Head%2BFirst%2Bjava%2BSecond%2Bedition.jpg", Status.STATUS_BOOK.APPROVED);
//        Book book3 = new Book(3, "Làm Quen với SQL Server 2008 - Tủ Sách FPT", list, author5, "Learning a complex new language is no easy task especially when it s an object-oriented computer programming language like Java. You might think the problem is your brain. It seems to have a mind of its own, a mind that doesn't always want to take in the dry, technical stuff you're forced to study.",
//                "<p>The fact is your brain craves novelty. It&#39;s constantly searching, scanning, waiting for something unusual to happen. After all, that&#39;s the way it was built to help you stay alive. It takes all the routine, ordinary, dull stuff and filters it to the background so it won&#39;t interfere with your brain&#39;s real work--recording things that matter. How does your brain know what matters? It&#39;s like the creators of the Head First approach say, suppose you&#39;re out for a hike and a tiger jumps in front of you, what happens in your brain? Neurons fire. Emotions crank up. Chemicals surge. That&#39;s how your brain knows. And that&#39;s how your brain will learn Java. Head First Java combines puzzles, strong visuals, mysteries, and soul-searching interviews with famous Java objects to engage you in many different ways. It&#39;s fast, it&#39;s fun, and it&#39;s effective. And, despite its playful appearance, Head First Java is serious stuff: a complete introduction to object-oriented programming and Java. You&#39;ll learn everything from the fundamentals to advanced topics, including threads, network sockets, and distributed programming with RMI. And the new. second edition focuses on Java 5.0, the latest version of the Java language and development platform. Because Java 5.0 is a major update to the platform, with deep, code-level changes, even more careful study and implementation is required. So learning the Head First way is more important than ever. If you&#39;ve read a Head First book, you know what to expect--a visually rich format designed for the way your brain works. If you haven&#39;t, you&#39;re in for a treat. You&#39;ll see why people say it&#39;s unlike any other Java book you&#39;ve ever read. By exploiting how your brain works, Head First Java compresses the time it takes to learn and retain--complex information. Its unique approach not only shows you what you need to know about Java syntax, it teaches you to think like a Java programmer. If you want to be bored, buy some other book. But if you want to understand Java, this book&#39;s for you.</p>\n",
//                "https://docplayer.vn/docs-images/98/138195237/images/1-0.jpg", Status.STATUS_BOOK.APPROVED);
//        Book book4 = new Book(4, "Mạng Máy Tính - Tủ Sách FPT", list3, author8, "Truy cập tới CSDL qua mạng,Hỗ trợ mô hình Client/Server Kho dữ liệu (Data WareHouse ), Tương thích với chuẩn ANSI/ISO SQL -92",
//                "<p>Thế giới ngầm được phản &aacute;nh trong tiểu thuyết Bố gi&agrave; l&agrave; sự gặp gỡ giữa một b&ecirc;n l&agrave; &yacute; ch&iacute; cương cường v&agrave; nền tảng gia tộc chặt chẽ theo truyền thống Mafia xứ Sicily với một b&ecirc;n l&agrave; x&atilde; hội Mỹ nhập nhằng đen trắng, mảnh đất m&agrave;u mỡ cho những cơ hội l&agrave;m ăn bất ch&iacute;nh hứa hẹn những m&oacute;n lợi kếch x&ugrave;. Trong thế giới ấy, h&igrave;nh tượng Bố gi&agrave; được t&aacute;c giả d&agrave;y c&ocirc;ng khắc họa đ&atilde; trở th&agrave;nh bức ch&acirc;n dung bất hủ trong l&ograve;ng người đọc. Từ một kẻ nhập cư tay trắng đến &ocirc;ng tr&ugrave;m tột đỉnh quyền uy, Don Vito Corleone l&agrave; con rắn hổ mang th&acirc;m trầm, nguy hiểm khiến kẻ th&ugrave; phải kiềng nể, e d&egrave;, nhưng cũng được bạn b&egrave;, th&acirc;n quyến xem như một đấng to&agrave;n năng đầy nghĩa kh&iacute;. Nh&acirc;n vật trung t&acirc;m ấy đồng thời cũng l&agrave; hiện th&acirc;n của một pho triết l&iacute; rất &ldquo;đời&rdquo; được nh&agrave;o nặn từ vốn sống của h&agrave;ng chục năm lăn lộn giữa chốn giang hồ bao phen v&agrave;o sinh ra tử. Với kết cấu ho&agrave;n hảo, cốt truyện kh&ocirc;ng thiếu những pha h&agrave;nh động gay cấn, t&igrave;nh tiết bất ngờ v&agrave; kh&ocirc;ng kh&iacute; k&igrave;nh địch đến nghẹt thở, Bố gi&agrave; xứng đ&aacute;ng l&agrave; đỉnh cao trong sự nghiệp văn chương của Mario Puzo.</p>",
//                "https://congdongshop.com/wp-content/uploads/2017/10/mang-may-tinh.jpg", Status.STATUS_BOOK.UNAPPROVED);
//        Book book5 = new Book(5, "Bố Già (The Godfather)", list4, author3, "Bố già là tên một cuốn tiểu thuyết nổi tiếng của nhà văn người Mỹ gốc Ý Mario Puzo được xuất bản lần đầu vào năm 1969 bởi nhà xuất bản G. P. Putnam's Sons. Tác phẩm là câu chuyện về một gia đình mafia gốc Sicilia tại Mỹ được tạo lập và lãnh đạo bởi một nhân vật được gọi là Bố già Don Vito Corleone.",
//                "<p>Thế giới ngầm được phản &aacute;nh trong tiểu thuyết Bố gi&agrave; l&agrave; sự gặp gỡ giữa một b&ecirc;n l&agrave; &yacute; ch&iacute; cương cường v&agrave; nền tảng gia tộc chặt chẽ theo truyền thống Mafia xứ Sicily với một b&ecirc;n l&agrave; x&atilde; hội Mỹ nhập nhằng đen trắng, mảnh đất m&agrave;u mỡ cho những cơ hội l&agrave;m ăn bất ch&iacute;nh hứa hẹn những m&oacute;n lợi kếch x&ugrave;. Trong thế giới ấy, h&igrave;nh tượng Bố gi&agrave; được t&aacute;c giả d&agrave;y c&ocirc;ng khắc họa đ&atilde; trở th&agrave;nh bức ch&acirc;n dung bất hủ trong l&ograve;ng người đọc. Từ một kẻ nhập cư tay trắng đến &ocirc;ng tr&ugrave;m tột đỉnh quyền uy, Don Vito Corleone l&agrave; con rắn hổ mang th&acirc;m trầm, nguy hiểm khiến kẻ th&ugrave; phải kiềng nể, e d&egrave;, nhưng cũng được bạn b&egrave;, th&acirc;n quyến xem như một đấng to&agrave;n năng đầy nghĩa kh&iacute;. Nh&acirc;n vật trung t&acirc;m ấy đồng thời cũng l&agrave; hiện th&acirc;n của một pho triết l&iacute; rất &ldquo;đời&rdquo; được nh&agrave;o nặn từ vốn sống của h&agrave;ng chục năm lăn lộn giữa chốn giang hồ bao phen v&agrave;o sinh ra tử. Với kết cấu ho&agrave;n hảo, cốt truyện kh&ocirc;ng thiếu những pha h&agrave;nh động gay cấn, t&igrave;nh tiết bất ngờ v&agrave; kh&ocirc;ng kh&iacute; k&igrave;nh địch đến nghẹt thở, Bố gi&agrave; xứng đ&aacute;ng l&agrave; đỉnh cao trong sự nghiệp văn chương của Mario Puzo.</p>",
//                "https://media.voocdn.com/media/image/id/5d1c1c080df938e94aaa164f"
//                , Status.STATUS_BOOK.APPROVED);
//        Book book6 = new Book(6, "The Sherlock Holmes Handbook", list4, author8, "Full of fascinating how-to skills and evocative illustrations, this must-have guide will appeal to Baker Street Irregulars of all ages.\n",
//                "<p>This reader&rsquo;s companion to the casework of Sherlock Holmes explores the methodology of the world&rsquo;s most famous consulting detective. From analyzing fingerprints and decoding ciphers to creating disguises and faking one&rsquo;s own death, readers will learn how Holmes solved his most celebrated cases&mdash;plus an arsenal of modern techniques available to today&rsquo;s armchair sleuths. Along the way, readers will discover a host of trivia about the master detective and his universe: Why did Holmes never marry? How was the real Scotland Yard organized? Was cocaine really legal back then? And why were the British so terrified of Australia? For die-hardSherlockians and amateur investigators alike, this handbook is nothing less than . . . elementary.</p>\n",
//                "https://lacrimamens.com/blog/wp-content/uploads/2015/01/the-sherlock-holmes-handbook.jpg", Status.STATUS_BOOK.APPROVED);
//        Book book7 = new Book(7, "ROMEO AND JULIET", list1, author8, "Truyền thuyết về Roméo và Juliet đã được kể lại nhiều lần hơn 100 năm trước khi William Shakespeare viết thành kịch bản. Vào năm 1476 trong cuốn sách Ý nhan đề là Il Novellino, tác giả Masuccio Salernitano đã kể về mối tình vụng trộm, về vụ giết người, vụ đầy đi khỏi xứ, về một nhà tu sẵn lòng giúp đỡ và cả về đám cưới của hai gia đình thù nghịch. Năm 1530, Luigi da Porta cũng kể lại câu chuyện tình này, gắn cho các nhân vật trong truyện các tên Ý và nơi diễn ra nghịch cảnh là thành phố Verona. Theo truyện của Da Porta, đôi tình nhân này cũng tự sát. Tới năm 1562 tại nước Anh, nhà thơ Arthur Brooke đã dùng đề tài này trong tập thơ dài \"The Tragical Historye of Romeus and Julius\" (Lịch sử bi thương của Romeus và Julius), đã đề cập tới một thứ đam mê không thánh thiện, một thứ tình yêu vụng trộm, sự không vâng lời cha mẹ và bất tuân luật pháp. Ngôn ngữ trong tập thơ của Brooke thì khô khan, thiếu hấp dẫn dù cho tác giả có cảm tình với cặp uyên ương.",
//                "<p>Tới khi William Shakespeare d&ugrave;ng c&acirc;u chuyện t&igrave;nh kể tr&ecirc;n l&agrave;m chất liệu cho vở bi kịch, th&igrave; Đại Văn H&agrave;o đ&atilde; l&agrave;m cho c&aacute;c nh&acirc;n vật h&agrave;nh xử giống như ch&uacute;ng ta ng&agrave;y nay : họ c&oacute; c&aacute;c ưu điểm v&agrave; khuyết điểm, c&oacute; l&uacute;c nổi giận, c&oacute; l&uacute;c kh&ocirc;i h&agrave;i&hellip; Vở kịch &quot;Rom&eacute;o v&agrave; Juliet&quot; l&agrave; một chuyện t&igrave;nh v&agrave; một định mạng bi thương. C&aacute;c nh&acirc;n vật trong vở kịch đ&atilde; suy nghĩ như thế n&agrave;o, tại sao họ đ&atilde; chọn c&aacute;c c&aacute;ch h&agrave;nh động như vậy? Trong vở kịch &quot;Rom&eacute;o v&agrave; Juliet&quot; của Shakespeare, c&oacute; hai loại nh&acirc;n vật : loại chuyển biến (maturing characters) v&agrave; loại thụ động (static characters). C&aacute;c nh&acirc;n vật chuyển biến đ&atilde; ph&aacute;t triển v&agrave; thay đổi qua thời gian, đ&atilde; h&agrave;nh động theo nhiều c&aacute;ch t&ugrave;y theo c&aacute;c ho&agrave;n cảnh kh&aacute;c nhau, gồm c&oacute; Juliet, Rom&eacute;o, Cha Lawrence, Ho&agrave;ng Tử Escalus. Loại thụ động kh&ocirc;ng thay đổi, h&agrave;nh động theo lề lối ch&uacute;ng ta c&oacute; thể đo&aacute;n ra được, gồm c&oacute; b&agrave; v&uacute; nu&ocirc;i, Mercutio, Hầu Tước v&agrave; b&agrave; Montague, Hầu Tước v&agrave; b&agrave; Capulet, Tybalt, Benvolio, Paris &hellip; 1) Juliet l&agrave; một thiếu nữ trẻ, đang dần dần trở th&agrave;nh phụ nữ. Theo cốt truyện &Yacute;, Juliet 18 rồi qua tập thơ của Arthur Brooke, c&ocirc; ta 16 xu&acirc;n xanh nhưng trong vở kịch của Shakespeare, Juliet mới 13 tuổi, thơ ng&acirc;y v&agrave; &ocirc;m nhiều hy vọng. Juliet rất đẹp v&agrave; Rom&eacute;o đ&atilde; bị m&ecirc; hồn l&uacute;c mới gặp n&agrave;ng. Rồi ngay cả khi nằm trong ng&ocirc;i nh&agrave; mồ, khi ngắm nh&igrave;n x&aacute;c của Juliet, Rom&eacute;o đ&atilde; phải than rằng &quot;Tử Thần đ&atilde; h&uacute;t đi mật ngọt trong hơi thở của em, nhưng bất lực trước sắc đẹp của em !&quot;. Juliet l&agrave; một con người thực tế trong khi Rom&eacute;o thuộc loại người l&atilde;ng mạn. Tr&ecirc;n bao lơn thơ mộng, Rom&eacute;o thốt ra c&aacute;c lời y&ecirc;u đương th&igrave; Juliet n&oacute;i tới h&ocirc;n nh&acirc;n, b&agrave;n về l&uacute;c gặp nhau sắp tới v&agrave; c&aacute;ch th&ocirc;ng tin cho nhau. Juliet đ&atilde; lớn l&ecirc;n b&ecirc;n cạnh b&agrave; v&uacute; nu&ocirc;i v&agrave; b&agrave; mẹ, đ&atilde; muốn chiều l&ograve;ng mẹ cha trong cuộc h&ocirc;n nh&acirc;n mai sau, nhưng n&agrave;ng đ&atilde; suy nghĩ v&agrave; h&agrave;nh động cho ch&iacute;nh m&igrave;nh khi gặp Rom&eacute;o. N&agrave;ng biết rằng c&oacute; nhiều vấn đề tr&ecirc;n đời n&agrave;y, nhưng vẫn tin rằng &quot;t&igrave;nh y&ecirc;u&quot; c&oacute; thể gi&uacute;p cho con người vượt qua được mọi trở ngại. Juliet đ&atilde; kh&ocirc;ng c&ograve;n l&agrave; một c&ocirc; g&aacute;i dễ v&acirc;ng lời, m&agrave; l&agrave; một phụ nữ trẻ chịu tr&aacute;ch nhiệm về cuộc đời của ch&iacute;nh m&igrave;nh. 2) Romeo l&agrave; một thanh ni&ecirc;n lương thiện, tốt bụng, lịch sự, đẹp trai, đ&atilde; h&ocirc;n tay Juliet một c&aacute;ch k&iacute;nh mến v&agrave; gọi người đẹp l&agrave; n&agrave;ng ti&ecirc;n. Nhiều người đ&atilde; ưa th&iacute;ch Rom&eacute;o như Mercutio, Benvolio, b&agrave; v&uacute; của Juliet v&agrave; ngay cả Hầu Tước Capulet đ&atilde; gọi ch&agrave;ng l&agrave; &quot;người trẻ đức hạnh, biết kiềm chế&quot;. Cha Lawrence cũng y&ecirc;u mến Rom&eacute;o v&agrave; cố gắng l&agrave;m cho ch&agrave;ng hạnh ph&uacute;c. Kh&ocirc;ng được n&agrave;ng Rosaline đ&aacute;p lại t&igrave;nh y&ecirc;u, Romeo trở n&ecirc;n lẩn thẩn, đ&atilde; từng lang thang tr&ecirc;n đường phố hay giam m&igrave;nh trong căn ph&ograve;ng c&ocirc; đơn. Nhưng tới khi gặp Juliet, Romeo mới kh&aacute;m ph&aacute; thấy ch&iacute;nh m&igrave;nh v&agrave; t&igrave;nh y&ecirc;u đ&iacute;ch thực đ&atilde; l&agrave;m cho lời n&oacute;i của Rom&eacute;o trở th&agrave;nh c&aacute;c lời thơ! Tới khi phải bỏ trốn, đi cầu cứu Cha Lawrence, Rom&eacute;o đ&atilde; đ&aacute;nh mất ch&iacute;nh m&igrave;nh, kh&ocirc;ng c&ograve;n khả năng h&agrave;nh động đ&uacute;ng c&aacute;ch. Tới khi biết rằng Juliet vẫn c&ograve;n y&ecirc;u m&igrave;nh, Rom&eacute;o lại trở n&ecirc;n con người của h&agrave;nh động. V&agrave; trong ng&ocirc;i nh&agrave; mồ, Romeo đ&atilde; n&oacute;i sẽ h&agrave;nh động như thế n&agrave;o v&agrave; tại sao. Thật l&agrave; bi thương khi t&igrave;nh y&ecirc;u trở th&agrave;nh s&acirc;u đậm nhất! Romeo đ&atilde; t&igrave;m thấy ch&iacute;nh m&igrave;nh khi tự s&aacute;t. Ngo&agrave;i 2 nh&acirc;n vật ch&iacute;nh, c&ograve;n c&oacute; nhiều người kh&aacute;c như Cha Lawrence, một tu sĩ Cơ Đốc (Catholic) được k&iacute;nh trọng, c&oacute; c&aacute;c đức t&iacute;nh v&agrave; c&aacute;c yếu điểm, thường cố vấn cho Rom&eacute;o bằng c&aacute;c lời dạy của Ch&uacute;a v&agrave; cố gắng d&ugrave;ng địa vị của m&igrave;nh để chấm dứt mối hận th&ugrave; l&acirc;u đời. Ho&agrave;ng Tử Escalus l&agrave; một nh&agrave; cai trị Th&agrave;nh Verona, l&agrave; người đại diện cho trật tự v&agrave; luật ph&aacute;p. Escalus đ&atilde; ban h&agrave;nh c&aacute;c quy luật v&agrave; mong đợi người d&acirc;n tu&acirc;n theo kỷ luật. Trước mối t&igrave;nh ngang tr&aacute;i của Rom&eacute;o v&agrave; Juliet, Ho&agrave;ng Tử Escalus đ&atilde; kh&ocirc;ng hiểu r&otilde; c&aacute;c t&igrave;nh tiết của sự việc v&agrave; đ&atilde; chấp nhận rằng ch&iacute;nh m&igrave;nh kh&ocirc;ng phải l&agrave; thẩm quyền cuối c&ugrave;ng, v&agrave; ph&aacute;n x&eacute;t cuối c&ugrave;ng phải thuộc về Thượng Đế. &quot;Romeo v&agrave; Juliet&quot; l&agrave; vở kịch c&oacute; c&aacute;c chủ đề (themes) l&agrave; t&igrave;nh y&ecirc;u của hai người trẻ đối với mối hận th&ugrave; của hai gia đ&igrave;nh, t&igrave;nh y&ecirc;u giả hiệu (false love) giữa Rom&eacute;o v&agrave; Rosaline khi Rom&eacute;o tạo ra c&aacute;c t&igrave;nh cảm nh&acirc;n tạo đối với người đẹp, t&igrave;nh y&ecirc;u l&atilde;ng mạn (romantic), đ&iacute;ch thực (true love) v&agrave; thuần chất (pure) giữa Rom&eacute;o v&agrave; Juliet. Hai người trẻ n&agrave;y đ&atilde; gắn b&oacute; với nhau qua h&ocirc;n nh&acirc;n, sẵn l&ograve;ng chết v&igrave; nhau hơn l&agrave; bất trung với nhau. C&otilde;i chết đ&atilde; tới với hai kẻ y&ecirc;u thương say đắm bởi v&igrave; &quot;số mệnh&quot; (fate) : Romeo đ&atilde; bị đưa đường tới dạ hội của gia đ&igrave;nh Capulet do một t&ecirc;n bạn m&ugrave; qu&aacute;ng, c&aacute;c kế hoạch x&acirc;y dựng của đ&ocirc;i trẻ đ&atilde; gặp thất bại phải chăng l&agrave; do &quot;Thượng Đế &quot; đ&atilde; an b&agrave;i? Ngo&agrave;i ra trong vở kịch &quot;Romeo v&agrave; Juliet&quot;, c&ograve;n thấy rất nhiều t&igrave;nh tiết về trật tự c&ocirc;ng cộng đối nghịch với c&aacute;c x&aacute;o trộn ngo&agrave;i x&atilde; hội, sự v&ocirc; tội của đ&ocirc;i trẻ trước c&aacute;c lời khuy&ecirc;n bảo của bậc cha mẹ v&agrave; c&aacute;c người cố vấn, c&aacute;c kinh nghiệm của những nh&acirc;n vật kh&aacute;c trong kịch bản&hellip; Vở kịch đ&atilde; tr&igrave;nh b&agrave;y t&igrave;nh cảm c&ocirc; đơn khi Rom&eacute;o v&agrave; Juliet thấy Mercutio v&agrave; Tybalt đ&atilde; bị giết, v&agrave; khi đ&oacute; đ&ocirc;i trẻ mới hiểu r&otilde; c&aacute;c tai nạn bi thương, c&aacute;c thất bại của con người v&agrave; sự t&agrave;n &aacute;c tr&ecirc;n thế gian ! V&agrave; c&ocirc; đơn l&agrave; ho&agrave;n cảnh Juliet bị bỏ rơi trước những người th&acirc;n như cha mẹ, b&agrave; v&uacute; nu&ocirc;i, Cha Lawrence v&agrave; cuối c&ugrave;ng l&agrave; người y&ecirc;u Rom&eacute;o. Trong vở kịch &quot;Romeo v&agrave; Juliet&quot;, mỗi nh&acirc;n vật đ&atilde; n&oacute;i bằng thứ ng&ocirc;n ngữ ri&ecirc;ng, chứng tỏ giai cấp x&atilde; hội của từng người. William Shakespeare đ&atilde; d&ugrave;ng 3 thể văn kh&aacute;c nhau để diễn tả c&aacute;c nh&acirc;n vật, với thể h&agrave;i kịch (comedy) m&ocirc; tả l&uacute;c c&aacute;c người trẻ gặp nhau, y&ecirc;u nhau, c&oacute; c&aacute;c bạn b&egrave; vui vẻ v&agrave; c&aacute;c người hầu th&ocirc; tục. Đại Văn H&agrave;o c&ograve;n d&ugrave;ng tới thể văn kiểu &Yacute; (commedia del l&#39; arte) để n&oacute;i về c&aacute;c bậc cha mẹ ngăn c&aacute;ch những kẻ mới biết y&ecirc;u, n&oacute;i về c&aacute;c người hầu b&igrave;nh luận về t&igrave;nh dục. &quot;Rom&eacute;o v&agrave; Juliet&quot; l&agrave; vở kịch chứa đựng b&ecirc;n trong rất nhiều loại b&agrave;i thơ l&atilde;ng mạn cũng như c&aacute;c b&agrave;i thơ loại Sonnet.</p>",
//                "https://lh3.googleusercontent.com/proxy/n58q-cNWbSlejwe7EmEt6taagZQf1zZNe5__FOU9A1a4xgy0ZrzreJRXoeVVL4PCZvVRzaDPnwi77chCaYmmmDb6k6J2R4_2bLX1P6tYgDtwjR9PVk9eWUTCmBZAO_1ijBqstibjUzeIsRdSZn8fxWce", Status.STATUS_BOOK.UNAPPROVED);
//        Book book8 = new Book(8, "Án mạng trên sông Nile", list4, author8, "\"Án mạng trên sông Nile\" là một trong những tác phẩm nổi tiếng của nữ nhà văn Agatha Christie. Tác phẩm đã được chuyển thể thành phim điện ảnh, kịch và nhận được sự yêu thích, đón nhận nồng nhiệt của các độc giả khắp nơi trên thế giới.",
//                "<p>chuyện đầy hấp dẫn, hồi hộp trong những c&acirc;u chữ, &quot;&Aacute;n mạng tr&ecirc;n s&ocirc;ng Nile&quot; khiến cho độc giả đi từ bất ngờ n&agrave;y đến bất ngờ kh&aacute;c. Nội dung cuốn tiểu thuyết xoay quanh vụ &aacute;n mạng nghi&ecirc;m trọng diễn ra tr&ecirc;n con t&agrave;u du lịch tr&ecirc;n s&ocirc;ng Nile, nơi m&agrave; th&aacute;m tử Hercule Poirot đang nghỉ dưỡng. Những cuộc truy t&igrave;m hung thủ, những kh&aacute;m ph&aacute; từ những chi tiết nhỏ c&ograve;n s&oacute;t lại sẽ khiến cho ch&uacute;ng ta bị l&ocirc;i cuốn theo từng t&igrave;nh tiết, từng c&acirc;u chữ của truyện. Hơn g&igrave; hết, một c&aacute;i kết bất ngờ lu&ocirc;n l&agrave; điểm nhấn ghi lại dấu ấn trong l&ograve;ng độc giả nhiều hơn. V&agrave; cuốn tiểu thuyết &quot;&Aacute;n mạng tr&ecirc;n s&ocirc;ng Nile&quot; đ&atilde; l&agrave;m được điều đ&oacute;. Quả l&agrave; một cuốn tiểu thuyết trinh th&aacute;m rất đ&aacute;ng xem.</p>",
//                "https://www.venuscinema.vn/uploaded/phim/death_on_the_nile_teaser_vietnam.jpg", Status.STATUS_BOOK.APPROVED);
//        Book book9 = new Book(9, "Sự im lặng của bầy cừu", list2, author7, "\"Sự im lặng của bầy cừu\" là một tác phẩm trinh thám xen lẫn yếu tối kinh dị nổi tiếng do tác giả Thomas Harris chắp bút. Tác phẩm cũng đã được chuyển thể thành phim với cùng tựa đề vào năm 1991, gây được tiếng vang lớn trong giới điện ảnh, cũng như đưa tác phẩm đến gần với bạn đọc hơn.",
//                "<p>mi&ecirc;u tả t&acirc;m l&iacute; nh&acirc;n vật hết sức tinh tế, c&ugrave;ng với những t&igrave;nh tiết truyện gay cấn, hồi hộp, &quot;Sự im lặng của bầy cừu&quot; đ&atilde; để lại trong l&ograve;ng bạn đọc những ấn tượng s&acirc;u sắc, kh&oacute; phai v&agrave; &aacute;m ảnh về h&igrave;nh ảnh của Hannibal Lecter - một kẻ ăn thịt người.Nếu bạn l&agrave; người y&ecirc;u th&iacute;ch tiểu thuyết trinh th&aacute;m, đừng bỏ qua quyển tiểu thuyết nổi tiếng n&agrave;y nh&eacute;, Chắc chắn &quot;Sự im lặng của bầy cừu&quot; sẽ tạo được dấu ấn cực k&igrave; kh&oacute; phai với bạn. Link truyện online: http://sstruyen.com/doc-truyen/trinh-tham/su-im-lang-cua-bay-cuu/chuong-01/242897.html</p>\n",
//                "https://salt.tikicdn.com/cache/w1200/media/catalog/product/s/u/su-im-lang-cua-bay-cuu.jpg", Status.STATUS_BOOK.UNAPPROVED);
//        bookRepository.save(book1);
//        bookRepository.save(book2);
//        bookRepository.save(book3);
//        bookRepository.save(book4);
//        bookRepository.save(book5);
//        bookRepository.save(book6);
//        bookRepository.save(book7);
//        bookRepository.save(book8);
//        bookRepository.save(book9);
//
//        List<Book> listBook1 = new ArrayList<>();
//        listBook1.add(book1);listBook1.add(book2);listBook1.add(book4);listBook1.add(book7);listBook1.add(book9);
//        List<Book> listBook2 = new ArrayList<>();
//        listBook2.add(book6);listBook2.add(book7);listBook2.add(book9);
//        List<Book> listBook3 = new ArrayList<>();
//        listBook3.add(book5);listBook3.add(book6);
//        List<Book> listBook4 = new ArrayList<>();
//        listBook4.add(book1);listBook4.add(book2);listBook4.add(book3);listBook4.add(book4);
//
//        User user = new User(1, "admin", "Nguyễn Tuấn Đạt", "bkdn.ntdat@gmail.com",passwordEncoder.encode("123"), null, "ROLE_ADMIN");
//        User user1 = new User(2, "minhchuan", passwordEncoder.encode("123"), listBook1, "ROLE_USER");
//        User user2 = new User(3, "letuantu", passwordEncoder.encode("123"), listBook2, "ROLE_USER");
//        User user3 = new User(4, "ngoctrinh", passwordEncoder.encode("123"), listBook4, "ROLE_USER");
//        User user4 = new User(5, "phantuan", passwordEncoder.encode("123"), listBook3, "ROLE_USER");
//
//        userRepository.save(user);
//        userRepository.save(user1);
//        userRepository.save(user2);
//        userRepository.save(user3);
//        userRepository.save(user4);
//
//        Comment com1 = new Comment(1, book1, user1, "Nội dung hay");
//        Comment com2 = new Comment(2, book4, user3, "Đáng xem");
//        Comment com3 = new Comment(3, book2, user2, "Thực tế với người đọc");
//        Comment com4 = new Comment(4, book5, user1, "Rất bổ ích");
//        Comment com5 = new Comment(5, book9, user4, "Xin phép được share cho mọi người");
//        Comment com6 = new Comment(6, book4, user1, "Tác giả cần tìm hiểu thêm");
//        Comment com7 = new Comment(7, book1, user2, "Sẽ xem lại nhiều lần");
//        Comment com8 = new Comment(8, book8, user4, "❤Sách tạm được, sẽ ủng hộ nếu đầu tư hơn!!❤");
//        Comment com9 = new Comment(9, book2, user1, "Tham gia group của tớ để bàn thêm về phim");
//        Comment com10 = new Comment(10, book3, user3, "Tác giả cần tìm hiểu thêm");
//        Comment com11 = new Comment(11, book3, user4, "Sách tệ, giá cao");
//        Comment com12 = new Comment(12, book1, user3, "Tác giả cần tìm hiểu thạiêm");
//        Comment com13 = new Comment(13, book9, user1, "Nội dung lặp đi lặp lại");
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

    }
}