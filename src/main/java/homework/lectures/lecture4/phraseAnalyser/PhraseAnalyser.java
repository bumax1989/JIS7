package homework.lectures.lecture4.phraseAnalyser;
//********Checked***********
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PhraseAnalyser {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку");
        String readLine = reader.readLine();

        System.out.println(analyse(readLine));
    }

    public static String analyse(String text) {

        String answer;

        if ((text.startsWith("Make")) && (text.endsWith("great again"))) {
            answer = "It stands no chance";
        } else if ((text.startsWith("Make")) || (text.endsWith("great again"))) {
            answer = "It could be worse";
        } else
            answer = "It is fine, really";

        return answer;

    }
}
