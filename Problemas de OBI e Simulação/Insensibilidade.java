import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            long total = 0;
            for (int i = 0; i < n; i++) {
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
                total += (long) Math.pow(x1 - x2, 2) + (long) Math.pow(y1 - y2, 2);
            }
            System.out.println(total);
        }
        sc.close();
    }
}
