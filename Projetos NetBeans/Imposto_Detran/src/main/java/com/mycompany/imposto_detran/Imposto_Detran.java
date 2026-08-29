/*
 * EXERCÍCIO 5:
 * Num determinado Estado, para transferências de veículos, o DETRAN cobra uma taxa
 * de 1% para carros fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de
 * 1990 em diante, taxa esta incidindo sobre o valor de tabela do carro.
 

 
 * REGRAS:
 * 1. Aceitar preço com ponto (ex: 120.000 = 120 mil)
 * 2. Valor mínimo segundo Tabela FIPE: R$ 68.000,00
 */

package com.mycompany.imposto_detran;
import javax.swing.JOptionPane;

public class Imposto_Detran {


    public static double calcularImposto(int ano, double preco) {
        
 
        double imposto;
        
     
        
        // SE o ano for MENOR que 1990 (carro antigo)
        // < significa "menor que"
        if (ano < 1990) {
            // IMPOSTO DE 1%
            // 1% = 1/100 = 0.01
            // imposto = preço × 0.01
            imposto = preco * 0.01;
        } 
        // SE NÃO (ano for maior ou igual a 1990)
        // else 
        else {
            // IMPOSTO DE 1.5%
            // 1.5% = 1.5/100 = 0.015
            imposto = preco * 0.015;
        }
        
     
        return imposto;
        
    } 
    
   
    public static void main(String[] args) {
        
        int ano;           // guarda o ano do carro (inteiro)
        double preco;      // guarda o preço do carro (double)
        double impostoPago; // guarda o imposto
        

        String anoStr = JOptionPane.showInputDialog("Digite o ano do carro:");
        // Converter texto para número INTEIRO (Integer.parseInt)
        ano = Integer.parseInt(anoStr);
        
   
        String precoStr = JOptionPane.showInputDialog("Digite o preço do carro (R$):");
               
        
        // Exemplo: "120.000" vira "120000"
        String precoLimpo = precoStr.replace(".", "");
        preco = Double.parseDouble(precoLimpo);
        
       
        // Se o preço for menor que 68.000, mostra erro e encerra
        if (preco < 68000) {
            JOptionPane.showMessageDialog(null, 
                "❌ PREÇO INVÁLIDO! ❌\n\n" +
                "Segundo a Tabela FIPE (Abril/2026):\n" +
                "O valor mínimo de um veículo é R$ 68.000,00\n\n" +
                "Você digitou: R$ " + String.format("%.2f", preco) + "\n\n" +
                "Programa encerrado.");
            return; 
        }
        
      
        impostoPago = calcularImposto(ano, preco);
        
       
        JOptionPane.showMessageDialog(null,  

            "Ano do carro: " + ano + "\n" +
            "Preço do carro: R$ " + String.format("%.2f", preco) + "\n" +
            "Taxa aplicada: " + (ano < 1990 ? "1%" : "1.5%") + "\n" +
            "Imposto a pagar: R$ " + String.format("%.2f", impostoPago));
        
    } 
}