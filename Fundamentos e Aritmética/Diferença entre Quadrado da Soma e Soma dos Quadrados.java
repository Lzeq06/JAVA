import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            long n = sc.nextLong();
            long soma = n * (n + 1) / 2;
            long somaQuadrados = n * (n + 1) * (2 * n + 1) / 6;
            long diferenca = (soma * soma) - somaQuadrados;
            System.out.println(diferenca);
        }
        sc.close();
    }
}
