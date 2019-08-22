import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Picture  {
    public static void pic() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Задаем высоту :");
        int x = Integer.parseInt(reader.readLine());
        int b = 1;
        for (int i = 1; i <= x; ++i) {
            System.out.print("*");
            if (b <= i && b < x) {
                System.out.println();
                b++;
                i = 0;
            }
            if (x == i) {
                System.out.println();
                x--;
                i = 0;
            }

        }
    }
}