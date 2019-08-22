import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        System.out.println("Какую операцию хотите провести? \n" + "1. Ввод/Вывод чисел \n" + "2. Посчитать площадь треугольника \n"
                + "3. Посчитать длину окружности");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        if ("1".equals(x)) {
            Input.r1();
        } else if ("2".equals(x)) {
            Triangle.r2();
        } else if ("3".equals(x)) {
            Circle.r3();
        } else {
            System.out.println("Не угадал.");
        }

    }
}