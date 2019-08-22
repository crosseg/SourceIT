import java.util.ArrayList;
import java.util.List;


public class PrimeNums {
    public static void primeNums() {
        int num = 100;
        List<Integer> prime = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            boolean primeNum = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNum = false;
                }
            }
            if (primeNum) {
                prime.add(i);
            }
        }
        System.out.println(prime);
    }
}