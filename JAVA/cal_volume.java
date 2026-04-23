
//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
//VOLUME = 3.14159 * R2 * ALTURA

import java.util.Scanner;


class Main {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

        //declarar dados 

        System.out.print("Digite o valor do raio:");
        double raio = input.nextDouble();

          System.out.print("Digite o valor da altura:");
            double altura = input.nextDouble();

            double volume = 3.14159 * (raio * raio) * altura;

        
        System.out.printf("O valor do volume é: %.2f", volume);

        input.close();

        
            
        
        
       
    }
}