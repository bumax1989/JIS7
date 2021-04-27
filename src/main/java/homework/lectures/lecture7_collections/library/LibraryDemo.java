package homework.lectures.lecture7_collections.library;

import org.apache.log4j.BasicConfigurator;

public class LibraryDemo {
    public static void main(String[] args) {
        BasicConfigurator.configure();

        Book bookOne = new Book("War and Peace", "Leo Tolstoy");
        Book bookTwo = new Book("Anna Karenina", "Leo Tolstoy");
        Book bookThree = new Book("Karenina", "Leo Tolst");

        Library library = new Library();

        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);

        library.findByName("War and Peace");
        library.findByName("War and Peace1");
        library.findByAuthor("Leo Tolstoy");

        library.deleteBook(bookOne);

        library.findByAuthor("Leo Tolstoy");

    }
}
