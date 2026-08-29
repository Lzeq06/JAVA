import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de termos: ");
        int n = input.nextInt();

        int a = 1, b = 1;

        System.out.print("Fibonacci: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }

        input.close();
    }
}