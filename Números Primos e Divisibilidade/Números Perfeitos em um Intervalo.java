import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            int s = sc.nextInt();
            List<String> res = new ArrayList<>();
            for (int n = i; n <= s; n++) {
                if (n > 1) {
                    int soma = 1;
                    for (int d = 2; d * d <= n; d++) {
                        if (n % d == 0) {
                            soma += d;
                            if (d * d != n) soma += n / d;
                        }
                    }
                    if (soma == n) res.add(String.valueOf(n));
                }
            }
            if (!res.isEmpty()) System.out.println(String.join(" ", res));
        }
        sc.close();
    }
}
