package homework.lectures.lecture7_collections.library;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private static final Logger logger = Logger.getLogger(Library.class);
    private final Map<String, String> library = new HashMap<>();
    private static final String DIVIDER = "-------------------------------------------";

    public void addBook(Book book) {
        library.put(book.getBookName(), book.getAuthor());
    }

    public void findByName(String name) {

        boolean isFound = false;

        for (Map.Entry<String, String> pair : library.entrySet()) {
            if (pair.getKey().equals(name)) {
                logger.info("Book was found!");
                logger.info("Book Name: " + pair.getKey() + ", Author: " + pair.getValue());
                logger.info(DIVIDER);
                isFound = true;
            }
        }

        if (!isFound) {
            logger.info("The book " + name + " was not found!");
            logger.info(DIVIDER);
        }
    }

    public void findByAuthor(String author) {
        boolean isTrue = false;

        for (Map.Entry<String, String> pair : library.entrySet()) {
            if (pair.getValue().equals(author)) {
                logger.info("Book was found!");
                logger.info("Book Name: " + pair.getKey() + ", Author: " + pair.getValue());
                logger.info(DIVIDER);
                isTrue = true;
            }
        }

        if (!isTrue) {
            logger.info("Book was not found by author " + author);
            logger.info(DIVIDER);
        }

    }

    public void deleteBook(Book book) {
        library.remove(book.getBookName());
        logger.info("The book " + book.getBookName() + " by author " + book.getAuthor() + " was deleted");
        logger.info(DIVIDER);
    }

}
