import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double p = (a + b + c) / 2.0;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println(area);
        }
        sc.close();
    }
}
