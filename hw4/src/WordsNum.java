import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordsNum {
    public static void wordsNum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите предложение");
        String line = reader.readLine();
        int count = 0;

        if (line.length() != 0) {
            count++;
        }
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {

                count++;


            }

        }
        System.out.printf("В Вашем предложении %d слов", count);
    }
}