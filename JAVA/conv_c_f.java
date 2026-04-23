

//Faça um programa que leia uma temperatura em graus Centígrados e apresente-a convertida em graus Fahrenheit. A fórmula de conversão é:
//F = (9 * C + 160) / 5, onde F é a temperatura em Fahrenheit e C em graus Centígrados.


import java.util.Scanner;


class conv_c_f {
    public static void main(String[] args) {

        
                Scanner input = new Scanner(System.in);

        //Declarar os dados

   System.out.print("Digite a temperatura em Celsius:");
            float temp_celcius = input.nextFloat();

        //calculo da conversão

                float temp_fahrenheit = (9 * temp_celcius + 160) / 5;

                    System.out.printf("Temperatura em Fahrenheit: %.2fF", temp_fahrenheit);

        input.close();
        

       
    }
}