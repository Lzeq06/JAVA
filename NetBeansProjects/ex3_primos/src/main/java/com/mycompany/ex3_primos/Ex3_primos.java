/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

// Programa capaz de imprimir todos os números primos em um intervalo de números informado pelo usuário;



package com.mycompany.ex3_primos;

import javax.swing.JOptionPane;

public class Ex3_primos {

    public static void main(String[] args) {

        int num1 = 0, num2 = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                String valor1 = JOptionPane.showInputDialog("Digite o início:");
                if (valor1 == null) return;

                String valor2 = JOptionPane.showInputDialog("Digite o fim:");
                if (valor2 == null) return;

                num1 = Integer.parseInt(valor1);
                num2 = Integer.parseInt(valor2);

                entradaValida = true;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros.");
            }
        }

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        String resultado = "Números primos entre " + inicio + " e " + fim + ":\n";

        for (int i = inicio; i <= fim; i++) {

            if (i < 2) continue;

            boolean primo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                resultado += i + " ";
            }
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}