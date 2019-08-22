import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {
    public static void rectangle() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввеите высоту: ");
        int heigh = Integer.parseInt(reader.readLine());
        System.out.println("Введите ширину: ");
        int width = Integer.parseInt(reader.readLine());

        for (int x = 0; x < width; x++) {
            System.out.print("+");
        }
        System.out.println();

        for (int i = 1; i < heigh - 1; i++) {
            for (int j = 0; j < width; j++) {
                if ((j == 0) || (j == width - 1)) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int y = 0; y < width; y++) {
            System.out.print("+");
        }
        System.out.println();

    }
}