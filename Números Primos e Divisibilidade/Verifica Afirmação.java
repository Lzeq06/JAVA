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
            int n = sc.nextInt();
            for (int a = 2; a <= n / 2; a++) {
                if (ehPrimo(a) && ehPrimo(n - a)) {
                    System.out.println("sim");
                    sc.close();
                    return;
                }
            }
            System.out.println("nao");
        }
        sc.close();
    }
}
