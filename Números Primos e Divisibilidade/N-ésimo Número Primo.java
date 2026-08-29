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
            int c = 0;
            int p = 1;
            while (c < n) {
                p++;
                if (ehPrimo(p)) c++;
            }
            System.out.println(p);
        }
        sc.close();
    }
}
