import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println(0);
            } else {
                int a = 0, b = 1;
                for (int i = 2; i <= n; i++) {
                    int c = (a + b) % 10;
                    a = b;
                    b = c;
                }
                System.out.println(b);
            }
        }
        sc.close();
    }
}
