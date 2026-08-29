import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] taxas = new int[n];
            for (int i = 0; i < n; i++) taxas[i] = sc.nextInt();
            int maxLucro = -40000000;
            for (int i = 0; i <= n - 4; i++) {
                int temp = taxas[i] + taxas[i + 1] + taxas[i + 2] + taxas[i + 3];
                if (temp > maxLucro) maxLucro = temp;
            }
            System.out.println(maxLucro);
        }
        sc.close();
    }
}
