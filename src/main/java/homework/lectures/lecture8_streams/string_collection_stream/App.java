package homework.lectures.lecture8_streams.string_collection_stream;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> stringNameList = new ArrayList<>(){{
            add("Marina");
            add("Maksim");
            add("Alexey");
            add("Alexandr");
            add("Alexandra");
            add("Aleftina");
            add("Olga");
            add("Oleg");
        }};

        stringNameList.stream()
                .filter(it->it.startsWith("Al")&&it.endsWith("a")).forEach(System.out::println);
    }
}
