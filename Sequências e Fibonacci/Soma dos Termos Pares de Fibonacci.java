import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            long k = sc.nextLong();
            long a = 0, b = 1, soma = 0;
            while (a <= k) {
                if (a % 2 == 0) soma += a;
                long c = a + b;
                a = b;
                b = c;
            }
            System.out.println(soma);
        }
        sc.close();
    }
}
