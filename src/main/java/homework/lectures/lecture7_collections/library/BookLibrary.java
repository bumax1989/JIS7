package homework.lectures.lecture7_collections.library;

import java.util.HashMap;
import java.util.Map;

public class BookLibrary {

    private static final Map<String, Book> library = new HashMap<>();

    public static Map<String, Book> getLibrary() {
        return library;
    }
}
