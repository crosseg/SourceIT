import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void r1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 6значное число!!!");
        String s = br.readLine();
        int strLen = s.length();
        char c[] = new char[strLen];
        if (s.length() <= 6) {
            for (int i = 0; i < c.length; i++) {
                c[i] = s.charAt(i);
            }
            System.out.println("Выводим:");
            for (int i = 0; i < c.length; i++) {
                System.out.println(c[i]);
            }
        } else {
            System.out.println("Сказал же 6значное!");
        }
    }
}