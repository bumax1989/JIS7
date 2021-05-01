package homework.lectures.lecture7_collections.library;

import homework.lectures.lecture7_collections.library.service.BookService;
import homework.lectures.lecture7_collections.library.service.BookServiceImpl;
import org.apache.log4j.BasicConfigurator;

public class LibraryDemo {
    public static void main(String[] args) {
        BasicConfigurator.configure();

        Book bookOne = new Book("War and Peace", "Leo Tolstoy");
        Book bookTwo = new Book("Anna Karenina", "Leo Tolstoy");
        Book bookThree = new Book("Karenina", "Leo Tolst");

        BookService bookService = new BookServiceImpl();


    }
}
