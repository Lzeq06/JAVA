/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



////- Enunciado: Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro. Um vendedor de um plano de saúde apresentou a tabela a seguir.
//Criar um programa que entre com o nome e a idade de uma pessoa e mostre o valor que ela deverá pagar.
//    - Até 10 anos – R$ 30,00
//    - Acima de 10 até 29 anos – R$ 60,00
//    - Acima de 29 até 45 anos – R$ 120,00
//    - Acima de 45 até 59 anos – R$ 150,00
//    - Acima de  59 até 65 anos – R$ 250,00
//    - Maior que 65 anos – R$ 400,00



package com.mycompany.plano_saude;

import javax.swing.JOptionPane;

/**
 *
 * @author lab5
 */
public class Plano_saude {

    public static void main(String[] args) {
        
        
        
        int idade;
        String nome;
        double val_pagar;
        
        nome = JOptionPane.showInputDialog(null,"Nome Completo:");
        
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Idade:"));
        
        if(idade <= 10){
            val_pagar = 30.00;
        }
        else if(idade <= 29){
            val_pagar = 60.00;
        }
        else if(idade <= 45){
            val_pagar = 120.00;
        }
        else if(idade <= 59){
            val_pagar = 150.00;
        }
        else if(idade <= 65){
            val_pagar = 250.00;
        }
        else{
            val_pagar = 400.00;
        }

        JOptionPane.showMessageDialog(null,
                "Nome: " + nome +
                "\nIdade: " + idade +
                "\nValor do plano: R$ " + String.format("%.2f", val_pagar));
    }
}