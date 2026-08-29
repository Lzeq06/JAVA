import java.util.Scanner;

public class Main {
    public static boolean ehPrimo(long n) {
        if (n < 2) return false;
        for (long d = 2; d * d <= n; d++) {
            if (n % d == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            long n = sc.nextLong();
            long f = n * n + n + 41;
            System.out.println(f + " " + (ehPrimo(f) ? "sim" : "não"));
        }
        sc.close();
    }
}
