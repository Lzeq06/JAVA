/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//Programa que imprima até o “n” termo a seqüência de Fibonacci. 
//Série: 1,1,2,3,5,8,13,21.......
//Por exemplo, imprimir até o 6º termo: 1, 1, 2, 3, 5, 8




package com.mycompany.ex2_fibonacci;

import javax.swing.JOptionPane;

public class Ex2_fibonacci {

    public static void main(String[] args) {

        int n = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                String valor = JOptionPane.showInputDialog("Digite a quantidade de termos:");
                if (valor == null) return;

                n = Integer.parseInt(valor);

                if (n <= 0) {
                    JOptionPane.showMessageDialog(null, "Digite um número maior que 0.");
                } else {
                    entradaValida = true;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros.");
            }
        }

        String resultado = "Sequência de Fibonacci:\n";

        int a = 1, b = 1;

        for (int i = 1; i <= n; i++) {
            resultado += a + " ";

            int proximo = a + b;
            a = b;
            b = proximo;
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}