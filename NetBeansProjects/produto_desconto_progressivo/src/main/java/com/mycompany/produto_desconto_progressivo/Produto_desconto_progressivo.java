/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produto_desconto_progressivo;
/*
 * Exercício 1 - Produto com Desconto Progressivo
 * Fatec Mauá - TPI 04
 */

//1) Ler o nome de um produto, o preço e a quantidade comprada. Escreva o nome do
//produto comprado e o valor total a ser pago, considerando que são oferecidos descontos
//pelo número de unidades compradas, segundo a tabela abaixo:
//a) Até 10 unidades: valor total
//b) De 11 a 20 unidades: 10% de desconto
//c) De 21 a 50 unidades: 20% de desconto
//d) Acima de 50 unidades: 25% de desconto
//Calcular o valor total a ser pago através de uma função que retorna valor.

import javax.swing.JOptionPane;

public class Produto_desconto_progressivo  {  

   
   public static double calcularValorTotal(double preco, int quantidade) {
        double valorTotal = preco * quantidade;
        
        if (quantidade <= 10) {
            return valorTotal;                    // sem desconto
        } else if (quantidade <= 20) {
            return valorTotal * 0.90;             // 10% de desconto
        } else if (quantidade <= 50) {
            return valorTotal * 0.80;             // 20% de desconto
        } else {
            return valorTotal * 0.75;             // 25% de desconto
        }
    }

    public static void main(String[] args) {
        String nome, precoStr, qtdStr;
        double preco;
        int quantidade;
        double valorFinal;

        nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        precoStr = JOptionPane.showInputDialog("Digite o preço unitário:");
        qtdStr = JOptionPane.showInputDialog("Digite a quantidade comprada:");

        preco = Double.parseDouble(precoStr);
        quantidade = Integer.parseInt(qtdStr);

        valorFinal = calcularValorTotal(preco, quantidade);   // chamada da função

        JOptionPane.showMessageDialog(null, 
            "Produto: " + nome +
            "\nQuantidade: " + quantidade +
            "\nValor Total a Pagar: R$ " + String.format("%.2f", valorFinal));
    }
}
