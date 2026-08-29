/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salario_min;

//Para vários tributos, a base de cálculo é o salário mínimo. 

import java.util.Scanner;

//Fazer um programa que leia o valor do salário mínimo e o valor do salário de uma pessoa. 
//Calcular e mostrar quantos salários mínimos ela ganha.

/**
 *
 * @author labs
 */
public class Salario_min {

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        
        // Declaração dos dados
        
         System.out.print("Digite o valor do salário mínimo atual: ");
        double salario_minimo = input.nextDouble();

        System.out.print("Digite o valor do seu salário: ");
        double salario_pessoal = input.nextDouble();

        
        // Salário da pessoa / valor do salário mínimo
        double qtde_sal_min = salario_pessoal / salario_minimo;
        
        
     
        System.out.printf("Você ganha o equivalente a %.2f salários mínimos.", qtde_sal_min);

        input.close();
    }
}