/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.volume_ex;

import java.util.Scanner;

/**
 *
 * @author lab5
 */
public class Volume_ex {

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
