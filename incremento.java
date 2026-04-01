import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Limite: ");
        int limite = input.nextInt();

        System.out.print("Incremento: ");
        int incremento = input.nextInt();

        System.out.print("Sequência: ");

        for (int i = 0; i <= limite; i += incremento) {
            System.out.print(i + " ");
        }

        input.close();
    }
}