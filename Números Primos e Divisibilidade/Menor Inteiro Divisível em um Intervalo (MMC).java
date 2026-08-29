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
            long i = sc.nextLong();
            long s = sc.nextLong();
            long mmc = i;
            for (long n = i + 1; n <= s; n++) {
                mmc = (mmc / mdc(mmc, n)) * n;
            }
            System.out.println(mmc);
        }
        sc.close();
    }
}
