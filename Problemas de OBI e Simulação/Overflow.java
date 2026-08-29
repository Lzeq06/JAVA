import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            String c = sc.next();
            int q = sc.nextInt();
            long res = c.equals("+") ? ((long)p + q) : ((long)p * q);
            System.out.println(res <= n ? "OK" : "OVERFLOW");
        }
        sc.close();
    }
}
