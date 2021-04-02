package homework.lectures.lecture4.colorDetector;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LightColorDetector {
    public static void main(String[] args) throws Exception {

        System.out.println("Введите длину волны в диапазоне 380 - 750нм");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int wavelength = Integer.parseInt(reader.readLine());

        System.out.println(detect(wavelength));
    }

    public static String detect(int wavelength) {
        String answer;
        if (wavelength >= 380 && wavelength < 450) {
            answer = "Violet";
        } else if (wavelength >= 450 && wavelength < 495) {
            answer = "Blue";
        } else if (wavelength >= 495 && wavelength < 570) {
            answer = "Green";
        } else if (wavelength >= 570 && wavelength < 590) {
            answer = "Yellow";
        } else if (wavelength >= 590 && wavelength < 620) {
            answer = "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            answer = "Red";
        } else
            answer = "Invisible spectrum";

        return answer;
    }
}
