import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
    public static void r3() throws IOException  {
        System.out.println("Введи радиус окружности");
        double pi = 3.14;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int radius = Integer.parseInt(reader.readLine());
        if (radius > 0) {
            long area = Math.round(Math.PI * Math.pow(radius, 2));
            System.out.printf("Площадь круга с радиусом %d равна %d \n", radius, area);
        } else {
            System.out.println("Не правильно ;*( радиус не может быть меньше или равен нулю.");
        }
    }
}