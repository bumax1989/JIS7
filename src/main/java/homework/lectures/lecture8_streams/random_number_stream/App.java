package homework.lectures.lecture8_streams.random_number_stream;


import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {

        final int LIST_SIZE = 10;
        final int MIN_DISTANCE_RANGE = -100;
        final int MAX_DISTANCE_RANGE = 10000;

        List<Integer> listOfRandomNumbers = new ArrayList<Integer>();
        for (int i = 0; i <LIST_SIZE ; i++) {
            listOfRandomNumbers.add((int)(Math.random()*(MAX_DISTANCE_RANGE-MIN_DISTANCE_RANGE)+MIN_DISTANCE_RANGE));
        }

        listOfRandomNumbers.stream()
                .filter(it->it%2==0)
                .forEach(System.out::println);
    }
}
