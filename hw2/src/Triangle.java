import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void r2() throws IOException  {
        System.out.println("Введите длинну основание треугольника");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите длинну высоту треугольника");
        int x2 = Integer.parseInt(reader.readLine());
        if(x1>0 & x2>0){
            double sum = (x1 * x2) / 2;
            System.out.println("Обработка... \n " + sum);
        } else {
            System.out.println("Невозможно ;( Длинна не может быть меньше или равна нулю.");
        }
    }
}