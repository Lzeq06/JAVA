import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int maior = 1;
            int d = 2;
            while (d * d <= n) {
                if (n % d == 0) {
                    maior = d;
                    while (n % d == 0) n /= d;
                }
                d++;
            }
            if (n > 1) maior = n;
            System.out.println(maior);
        }
        sc.close();
    }
}
