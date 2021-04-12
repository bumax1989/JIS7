package homework.lectures.lectrure5.book;

import org.apache.log4j.Logger;

import java.util.Objects;

public class Book {
    private static final Logger logger = Logger.getLogger(Book.class);

    private String authorName;
    private String bookName;
    private Integer numberOfPages;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(authorName, book.authorName) &&
                Objects.equals(bookName, book.bookName) &&
                Objects.equals(numberOfPages, book.numberOfPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName, numberOfPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
