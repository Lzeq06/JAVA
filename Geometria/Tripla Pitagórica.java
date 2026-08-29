import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int a = 1; a <= t / 3; a++) {
                for (int b = a + 1; b < t; b++) {
                    int c = t - a - b;
                    if (c > b && a * a + b * b == c * c) {
                        System.out.println(a + " " + b + " " + c + " " + (a * b * c));
                    }
                }
            }
        }
        sc.close();
    }
}
