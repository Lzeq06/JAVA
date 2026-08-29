/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.saldo_conta_bancaria;
import javax.swing.JOptionPane;

//2) Ler número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o
//saldo atual (saldo atual = saldo - débito + crédito), através de uma função que retorne
//valor, também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo
//Positivo', senão escrever a mensagem 'Saldo Negativo'.

/**
 * @author Lzek_06
 */
public class Saldo_conta_bancaria {

  // Função que calcula o saldo atual
    public static double calcularSaldoAtual(double saldo, double debito, double credito) {
        return saldo - debito + credito;
    }

    public static void main(String[] args) {
        String conta, saldoStr, debitoStr, creditoStr;
        double saldo, debito, credito, saldoAtual;

        conta = JOptionPane.showInputDialog("Digite o número da conta:");
        saldoStr = JOptionPane.showInputDialog("Digite o saldo:");
        saldoStr=saldoStr.replace(",", ".");
        debitoStr = JOptionPane.showInputDialog("Digite o débito:");
        debitoStr=debitoStr.replace(",", ".");
        creditoStr = JOptionPane.showInputDialog("Digite o crédito:");
        creditoStr=creditoStr.replace(",", ".");

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