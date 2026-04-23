package com.mycompany.ex1_pares;

//Programa capaz de imprimir todos os números pares em um intervalo de números informados pelo usuário;

import javax.swing.JOptionPane;

public class Ex1_pares {

    public static void main(String[] args) {

        int num1 = 0, num2 = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                String valor1 = JOptionPane.showInputDialog("Digite o número que marca o início:");
                if (valor1 == null) return;

                String valor2 = JOptionPane.showInputDialog("Digite número que marca o fim:");
                if (valor2 == null) return;

                num1 = Integer.parseInt(valor1);
                num2 = Integer.parseInt(valor2);

                entradaValida = true;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Digite apenas números inteiros.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        String resultado = "Números pares entre o intervalo de " + num1 + " e " + num2 + ":\n";

        if (inicio % 2 != 0) {
            inicio++;
        }

        for (int i = inicio; i <= fim; i += 2) {
            resultado += i + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}