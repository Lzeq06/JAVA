import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            int s = sc.nextInt();
            List<String> primos = new ArrayList<>();
            for (int n = i; n <= s; n++) {
                if (ehPrimo(n)) primos.add(String.valueOf(n));
            }
            if (!primos.isEmpty()) System.out.println(String.join(" ", primos));
        }
        sc.close();
    }
}
