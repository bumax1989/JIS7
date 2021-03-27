package homework.lectures.lecture1;

import java.util.Random;

public class RandomGenerator {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int sum;

        Random randomGenerator = new Random();
        a = randomGenerator.nextInt(100);
        b = randomGenerator.nextInt(100);
        c = randomGenerator.nextInt(100);

        sum = a + b + c;

        System.out.println("Число a = " + a + " Число b = " + b + " Число c = " + c);
        System.out.println("Сумма чисел a+b+c = " + sum);
    }
}
