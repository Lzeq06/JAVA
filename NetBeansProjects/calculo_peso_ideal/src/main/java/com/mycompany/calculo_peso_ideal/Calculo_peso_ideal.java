/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

// 4 - Calcule o peso ideal de uma pessoa através de uma função que não retorne valor. Dados;
// de entrada: altura e sexo. Fórmulas para cálculo do peso:
// peso ideal de homem = (72,7 x altura) - 58
// peso ideal da mulher = (62,1 x altura) - 44,7


package com.mycompany.calculo_peso_ideal;


import javax.swing.JOptionPane;


public class Calculo_peso_ideal {

   
    public static void calcularPesoIdeal(double altura, String sexo) {
        
     
        // double - tipo número decimal (pode ter vírgula: 68.5)
        // pesoIdeal - nome da variável que vai guardar o resultado do cálculo
        double pesoIdeal;
        
      
        // sexo.equalsIgnoreCase("M") - compara se o texto digitado é igual a "M"
        // equalsIgnoreCase - ignora se é maiúsculo ou minúsculo ("M" ou "m" dá certo)
        // || - "OU"
        // sexo.equalsIgnoreCase("MASCULINO") - também aceita a palavra completa
        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("MASCULINO")) {
            
          
            // pesoIdeal = (72,7 x altura) - 58
    
            pesoIdeal = (72.7 * altura) - 58;
            
            // String.format("%.2f", pesoIdeal) - formata o número com 2 casas decimais
            JOptionPane.showMessageDialog(null, 
                "Sexo: Masculino\n" +          
                "Altura: " + altura + " m\n" +   
                "Peso ideal: " + String.format("%.2f", pesoIdeal) + " kg"); 
        } 
  
        else if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("FEMININO")) {
            
           
            // Fórmula: (62,1 x altura) - 44,7
            pesoIdeal = (62.1 * altura) - 44.7;
            
           
            JOptionPane.showMessageDialog(null, 
                "Sexo: Feminino\n" +
                "Altura: " + altura + " m\n" +
                "Peso ideal: " + String.format("%.2f", pesoIdeal) + " kg");
        }
     

        else {
            // Mostra mensagem de erro
            JOptionPane.showMessageDialog(null, 
                "Sexo inválido! Digite M (masculino) ou F (feminino)");
        }
        
    }
    
 
    public static void main(String[] args) {
        
      
        String alturaStr = JOptionPane.showInputDialog("Digite sua altura (em metros):");
        
        // Double.parseDouble() - transforma "1.75" (texto) em 1.75 (número)
        double altura = Double.parseDouble(alturaStr);
       
        String sexo = JOptionPane.showInputDialog("Digite seu sexo:\nM - Masculino\nF - Feminino");
        
    
        calcularPesoIdeal(altura, sexo);
       
      
    } 
}