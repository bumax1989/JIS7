package homework.lectures.lecture2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Random;

public class ArraysTask2 {

    static Integer[] array;
    static Integer[] newEnlargedArray;

    public static void main(String[] args) throws Exception {
        System.out.println("Задайте длину массива");
        Reader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = Integer.parseInt(((BufferedReader) reader).readLine());

        arrayFill(inputNumber);
    }

    public static void arrayFill(int number) {

        array = new Integer[5];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        if (number == array.length) {
            int newArrayLength = (int) (array.length * 1.5);
            newEnlargedArray = new Integer[newArrayLength];
            for (int i = 0; i < array.length; i++) {
                newEnlargedArray[i] = array[i];
            }

            for (int i = 0; i < newEnlargedArray.length; i++) {
                System.out.print(newEnlargedArray[i] + " ");
            }

            array = null;
        } else
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }


    }
}
