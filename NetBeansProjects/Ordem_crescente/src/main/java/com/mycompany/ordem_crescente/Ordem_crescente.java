/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//Objetivo: ler três números e mostrá-los em ordem crescente.
//Entradas: 3 números.
//Saída: os 3 valores em ordem crescente.


package com.mycompany.ordem_crescente;

import javax.swing.JOptionPane;

public class Ordem_crescente {

    public static void main(String[] args) {
       
        int n1,n2,n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
        
        int menor, meio, maior;
        
        menor = n1;
       
        if(n2 < menor){
            menor = n2;
        } 
        
        if(n3 < menor){
            menor = n3;
        }
        
        maior = n1;
        
        if(n2 > maior){
            maior = n2;
        }
        
        if(n3 > maior){
            maior = n3;
        }
        
        meio = n1 + n2 + n3 - menor - maior;
        
        JOptionPane.showMessageDialog(null,
        "A ordem crescente dos seus números é: " 
        + menor + " , " + meio + " , " + maior);
        
    }
}