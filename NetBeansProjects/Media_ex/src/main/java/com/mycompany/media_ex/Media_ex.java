/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media_ex;

import java.util.Scanner;
/**
 *
 * @author lab5
 */
public class Media_ex {

 public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
        
        // Declaração dos dados
        
         System.out.print("Digite o primeiro número: ");
        float num_1 = input.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num_2 = input.nextFloat();

        
        // num 1 + num 2 /2
        float media = num_1 + num_2 / 2;
        
         System.out.printf("A média entre %.2f e %.2f é: %.2f", num_1, num_2, media);

        input.close();
    }
}