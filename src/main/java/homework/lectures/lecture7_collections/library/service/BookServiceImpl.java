package homework.lectures.lecture7_collections.library.service;

import homework.lectures.lecture7_collections.library.Book;
import homework.lectures.lecture7_collections.library.BookLibrary;
import homework.lectures.lecture7_collections.library.BookNotFoundException;
import org.apache.log4j.Logger;

import java.util.Collection;
import java.util.Map;

import static homework.lectures.lecture7_collections.library.BookLibrary.*;

public class BookServiceImpl implements BookService {
//TODO:  Value in map as Collection Book!
    private static final Logger logger = Logger.getLogger(BookLibrary.class);

    @Override
    public Book findByName(String bookName) {
        for (Map.Entry<String, Book> pair : getLibrary().entrySet()) {
            if (pair.getValue().getBookName().equals(bookName)) {
                logger.info("Book found: " + pair.getValue().getBookName());
                return pair.getValue();
            }
        }
        throw new BookNotFoundException("Cannot find book with name with author " + bookName);
    }

    @Override
    public Book add(Book book) {
        getLibrary().put(book.getAuthor(), book);
        logger.info("Book added successfully " + book );
        return book;
    }

    @Override
    public Book findByAuthor(String authorName) {
        for (Map.Entry<String, Book> pair : getLibrary().entrySet()) {
            if (pair.getKey().equals(authorName)) {
                logger.info("Book found: " + pair.getValue().getBookName());
                return pair.getValue();
            }
        }
        throw new BookNotFoundException("Cannot find book with name with author " + authorName);
    }

    @Override
    public void delete(Book book) {
        getLibrary().remove(book.getAuthor());
    }
}
