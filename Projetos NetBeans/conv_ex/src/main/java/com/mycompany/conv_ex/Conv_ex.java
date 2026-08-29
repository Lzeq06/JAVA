/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conv_ex;

import java.util.Scanner;

/**
 *
 * @author lab5
 */
public class Conv_ex {

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
