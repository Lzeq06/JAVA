import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o início: ");
        int num1 = input.nextInt();

        System.out.print("Digite o fim: ");
        int num2 = input.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.print("Pares: ");

        if (inicio % 2 != 0) {
            inicio++;
        }

        for (int i = inicio; i <= fim; i += 2) {
            System.out.print(i + " ");
        }

        input.close();
    }
}