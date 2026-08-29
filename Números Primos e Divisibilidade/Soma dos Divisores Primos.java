import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int soma = 0;
            int d = 2;
            while (d * d <= n) {
                if (n % d == 0) {
                    soma += d;
                    while (n % d == 0) n /= d;
                }
                d++;
            }
            if (n > 1) soma += n;
            System.out.println(soma);
        }
        sc.close();
    }
}
