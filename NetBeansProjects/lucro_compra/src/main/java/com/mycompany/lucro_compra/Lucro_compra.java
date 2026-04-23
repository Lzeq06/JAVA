/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lucro_compra;

import javax.swing.JOptionPane;





//Um comerciante comprou um produto e quer vendê-lo com um lucro de 45%
//se o valor da compra for menor que R$20,00; 
//caso contrário, o lucro será de 30%.
//Entrar com o valor do produto e imprimir o valor da venda.

/**
 *
 * @author labs
 */
public class Lucro_compra {

    public static void main(String[] args) {
     double val_compra, val_venda;

        val_compra = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor de compra do produto:")
        );

        if (val_compra < 20) {
            val_venda = val_compra * 1.45;
        } else {
            val_venda = val_compra * 1.30;
        }

        JOptionPane.showMessageDialog(null, "O valor da venda será: R$ " + val_venda);
    }
}

      
   
        
        
        
        
        
        
        
        
        
        
        

