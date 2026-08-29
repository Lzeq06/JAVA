import java.util.Scanner;

public class Main {
    public static long mdc(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            long n = sc.nextLong();
            long d = sc.nextLong();
            long q = sc.nextLong();
            long div = mdc(d, q);
            long r = d / div;
            long p = q / div;
            if (n < 60 && (r >= (1L << n) || p >= (1L << n))) {
                System.out.println("IMPOSSIVEL");
            } else {
                System.out.println(r + " " + p);
            }
        }
        sc.close();
    }
}
