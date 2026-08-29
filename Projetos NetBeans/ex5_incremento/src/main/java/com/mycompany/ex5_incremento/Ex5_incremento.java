/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


//Criar um programa que leia um número que será o limite superior de um intervalo e o incremento.
//Exibir todos os números naturais no intervalo de 0 até esse número. 
//Suponha que os dois números lidos são maiores que zero. 
//Exemplo: Limite superior: 20 Incremento: 5 Saída: 0 5 10 15 20



package com.mycompany.ex5_incremento;

import javax.swing.JOptionPane;

public class Ex5_incremento {

    public static void main(String[] args) {

        int limite = 0, incremento = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                String valor1 = JOptionPane.showInputDialog("Digite o limite superior:");
                if (valor1 == null) return;

                String valor2 = JOptionPane.showInputDialog("Digite o incremento:");
                if (valor2 == null) return;

                limite = Integer.parseInt(valor1);
                incremento = Integer.parseInt(valor2);

                if (limite > 0 && incremento > 0) {
                    entradaValida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Os valores devem ser maiores que 0.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros.");
            }
        }

        String resultado = "Sequência:\n";

        for (int i = 0; i <= limite; i += incremento) {
            resultado += i + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}