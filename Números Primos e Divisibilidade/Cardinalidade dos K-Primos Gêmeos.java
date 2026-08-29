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
            int k = sc.nextInt();
            int s = sc.nextInt();
            int c = 0;
            for (int x = i; x + k <= s; x++) {
                if (ehPrimo(x) && ehPrimo(x + k)) c++;
            }
            System.out.println(c);
        }
        sc.close();
    }
}
