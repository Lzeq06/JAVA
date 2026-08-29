import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            if (a != 0) {
                double d = b * b - 4 * a * c;
                if (d >= 0) {
                    double r1 = (-b - Math.sqrt(d)) / (2 * a);
                    double r2 = (-b + Math.sqrt(d)) / (2 * a);
                    System.out.println(r1 + " " + r2);
                    sc.close();
                    return;
                }
            }
            System.out.println("Como b^2 - 4ac < 0, as raizes serao numeros complexos");
        }
        sc.close();
    }
}
