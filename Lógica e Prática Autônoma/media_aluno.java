import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nota trabalho: ");
        double trabalho = input.nextDouble();

        System.out.print("Nota prova: ");
        double prova = input.nextDouble();

        double media = (trabalho * 0.4) + (prova * 0.6);

        System.out.println("Média: " + media);

        if (media >= 6) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        input.close();
    }
}