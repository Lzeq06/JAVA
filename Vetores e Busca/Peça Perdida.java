import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            long n = sc.nextLong();
            long somaEsperada = n * (n + 1) / 2;
            long somaAtual = 0;
            for (int i = 1; i < n; i++) {
                somaAtual += sc.nextLong();
            }
            System.out.println(somaEsperada - somaAtual);
        }
        sc.close();
    }
}
