import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Início: ");
        int num1 = input.nextInt();

        System.out.print("Fim: ");
        int num2 = input.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.print("Primos: ");

        for (int i = inicio; i <= fim; i++) {

            if (i < 2) continue;

            boolean primo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}