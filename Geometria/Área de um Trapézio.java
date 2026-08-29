import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double b1 = sc.nextDouble();
            double b2 = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.println((b1 + b2) * h / 2.0);
        }
        sc.close();
    }
}
