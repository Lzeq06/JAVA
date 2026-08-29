/*
 * Exercício 1 - Produto com Desconto Progressivo
 */

import javax.swing.JOptionPane;

public class Exercicio1_ProdutoDesconto {

    public static double calcularValorTotal(double preco, int quantidade) {
        double valorTotal = preco * quantidade;
        
        if (quantidade <= 10) {
            return valorTotal;
        } else if (quantidade <= 20) {
            return valorTotal * 0.90;
        } else if (quantidade <= 50) {
            return valorTotal * 0.80;
        } else {
            return valorTotal * 0.75;
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

        valorFinal = calcularValorTotal(preco, quantidade);

        JOptionPane.showMessageDialog(null, 
            "Produto: " + nome +
            "\nQuantidade: " + quantidade +
            "\nValor Total a Pagar: R$ " + String.format("%.2f", valorFinal));
    }
}