package homework.lectures.lecture7_collections.library.service;

import homework.lectures.lecture7_collections.library.Book;

import java.util.Collection;

public interface BookService {

    Book findByName(String bookName);

    Book add(Book book);

    Book findByAuthor(String authorName);

    void delete(Book book);
}
