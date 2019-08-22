import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wallpaper  {
    public static void wallpaper() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Количество линий");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Высота");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Ширина");
        int c = Integer.parseInt(reader.readLine());
        for (int k = 0; k < b; k++) {
            for (int i = 0; i < a; i++) {
                if (i % 2 != 0) {
                    for (int j = 0;j < c;j++) {
                        System.out.print("+");
                    }
                } else {
                    for (int j = 0; j < c; j++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

}