/*
 * Exercício 2 - Saldo Bancário
 */

import javax.swing.JOptionPane;

public class Exercicio2_SaldoBancario {

    public static double calcularSaldoAtual(double saldo, double debito, double credito) {
        return saldo - debito + credito;
    }

    public static void main(String[] args) {
        String conta, saldoStr, debitoStr, creditoStr;
        double saldo, debito, credito, saldoAtual;

        conta = JOptionPane.showInputDialog("Digite o número da conta:");
        saldoStr = JOptionPane.showInputDialog("Digite o saldo:");
        debitoStr = JOptionPane.showInputDialog("Digite o débito:");
        creditoStr = JOptionPane.showInputDialog("Digite o crédito:");

        saldo = Double.parseDouble(saldoStr);
        debito = Double.parseDouble(debitoStr);
        credito = Double.parseDouble(creditoStr);

        saldoAtual = calcularSaldoAtual(saldo, debito, credito);

        String mensagem;
        if (saldoAtual >= 0) {
            mensagem = "Saldo Positivo";
        } else {
            mensagem = "Saldo Negativo";
        }

        JOptionPane.showMessageDialog(null, 
            "Conta: " + conta +
            "\nSaldo Atual: R$ " + String.format("%.2f", saldoAtual) +
            "\n\n" + mensagem);
    }
}