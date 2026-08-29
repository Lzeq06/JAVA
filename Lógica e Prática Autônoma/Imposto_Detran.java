/*
 * Exercício 5 - Imposto DETRAN
 */

import javax.swing.JOptionPane;

public class Exercicio5_ImpostoDetran {

    public static double calcularImposto(int ano, double preco) {
        if (ano < 1990) {
            return preco * 0.01;
        } else {
            return preco * 0.015;
        }
    }
    
    public static void main(String[] args) {
        int ano;
        double preco;
        double impostoPago;
        
        String anoStr = JOptionPane.showInputDialog("Digite o ano do carro:");
        ano = Integer.parseInt(anoStr);
        
        String precoStr = JOptionPane.showInputDialog("Digite o preço do carro (R$):");
        
        // Remove ponto para transformar 120.000 em 120000
        String precoLimpo = precoStr.replace(".", "");
        preco = Double.parseDouble(precoLimpo);
        
        // Valor mínimo segundo Tabela FIPE: R$ 68.000
        if (preco < 68000) {
            JOptionPane.showMessageDialog(null, 
                "PREÇO INVÁLIDO!\n\n" +
                "Valor mínimo de um veículo: R$ 68.000,00\n\n" +
                "Programa encerrado.");
            return;
        }
        
        impostoPago = calcularImposto(ano, preco);
        
        JOptionPane.showMessageDialog(null,  
            "=== DETRAN - Imposto de Transferência ===\n\n" +
            "Ano do carro: " + ano + "\n" +
            "Preço do carro: R$ " + String.format("%.2f", preco) + "\n" +
            "Taxa aplicada: " + (ano < 1990 ? "1%" : "1.5%") + "\n" +
            "Imposto a pagar: R$ " + String.format("%.2f", impostoPago));
    }
}