import java.util.Scanner;

public class Main {
    public static int somaDivisores(int n) {
        if (n <= 1) return 0;
        int soma = 1;
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                soma += d;
                if (d * d != n) soma += n / d;
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            int s = sc.nextInt();
            for (int a = i; a <= s; a++) {
                int b = somaDivisores(a);
                if (a < b && b <= s && somaDivisores(b) == a) {
                    System.out.println(a + " " + b);
                }
            }
        }
        sc.close();
    }
}
