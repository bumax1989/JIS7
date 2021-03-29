package homework.lectures.lecture2;
//**********@Checked***************//
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraysTask1 {
    public static void main(String[] args) {

        Random random = new Random();
        Integer[] array = new Integer[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        Arrays.sort(array);

        newArray(array, arrayFlip(array));

    }

    public static Integer[] arrayFlip(Integer[] array1) {

        Integer[] arrayFl = new Integer[5];

        for (int i = 0; i < array1.length; i++) {
            arrayFl[i] = array1[i];
        }

        Arrays.sort(arrayFl, Collections.reverseOrder());

        return arrayFl;
    }

    public static void newArray(Integer[] array1, Integer[] array2) {

        int wholeLengthOfArrays = array1.length + array2.length;

        Integer[] wholeArray = new Integer[wholeLengthOfArrays];

        int counter =0;
        for (int i = 0; i <array1.length ; i++) {
            wholeArray[i]=array1[i];
            counter++;
        }
        for (int j = 0; j <array2.length ; j++) {
            wholeArray[counter++] = array2[j];

        }

        for (int i = 0; i < wholeArray.length; i++) {
            System.out.println(wholeArray[i]);
        }

    }

}
