/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//Objetivo: ler um valor e informar se ele é ou não múltiplo de 3.
// Entradas: número inteiro.
// Saída: mensagem dizendo se é múltiplo de 3.

package com.mycompany.multiplo_3;

import javax.swing.JOptionPane;
/**
 *
 * @author labs
 */
public class Multiplo_3 {

    public static void main(String[] args) {
        
       
       int numero;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
       
       if(numero % 3 == 0) {
           JOptionPane.showMessageDialog(null, "O número é multiplo de 3.");
       }
       
       else { 
           JOptionPane.showMessageDialog(null,"O número não é multiplo de 3");
           
       }
        
    }
}
