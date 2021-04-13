package homework.lectures.lectrure5.book;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BookDemo {
    private static final Logger logger = Logger.getLogger(BookDemo.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Book book1 = new Book();
        Book book2 = new Book();

        book1.setAuthorName("Lev Tolstoy");
        book2.setAuthorName("Lev Tolstoy");

        book1.setBookName("War and peace Part2");
        book2.setBookName("War and peace Part2");

        book1.setNumberOfPages(1000);
        book2.setNumberOfPages(1000);

        logger.info(book1.equals(book2));

        logger.info(book1.hashCode());
        logger.info(book2.hashCode());

        logger.info(book1);
        logger.info(book2);
    }
}
