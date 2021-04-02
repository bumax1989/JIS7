package homework.lectures.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignCoparator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int inputNumber = Integer.parseInt(reader.readLine());

        System.out.println(compare(inputNumber));
    }

    public static String compare(int number) {

        String answer;

        if (number > 0) {
            answer = "Number is positive";
        } else if (number < 0) {
            answer = "Number is negative";
        } else
            answer = "Number is equal to zero";

        return answer;
    }
}
