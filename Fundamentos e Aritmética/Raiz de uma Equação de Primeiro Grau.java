import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (a != 0) {
                System.out.println(-b / a);
            } else {
                System.out.println("A equacao nao possui raiz unica");
            }
        }
        sc.close();
    }
}
