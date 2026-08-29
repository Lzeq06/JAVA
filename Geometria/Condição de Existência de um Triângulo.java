import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Forma um triangulo");
            } else {
                System.out.println("Nao forma um triangulo");
            }
        }
        sc.close();
    }
}
