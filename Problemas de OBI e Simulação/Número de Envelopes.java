import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int menor = sc.nextInt();
            for (int i = 1; i < n; i++) {
                int qtd = sc.nextInt();
                if (qtd < menor) menor = qtd;
            }
            System.out.println(menor);
        }
        sc.close();
    }
}
