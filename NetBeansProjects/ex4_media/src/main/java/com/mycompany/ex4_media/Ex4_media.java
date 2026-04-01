/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


//Um programa que calcule a média de uma aluno nos moldes da Fatec MAUÁ.



package com.mycompany.ex4_media;

import javax.swing.JOptionPane;

public class Ex4_media {

    public static void main(String[] args) {

        double trabalho = 0, prova = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                String valor1 = JOptionPane.showInputDialog("Digite a nota do trabalho:");
                if (valor1 == null) return;

                String valor2 = JOptionPane.showInputDialog("Digite a nota da prova:");
                if (valor2 == null) return;

                trabalho = Double.parseDouble(valor1);
                prova = Double.parseDouble(valor2);

                entradaValida = true;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números válidos.");
            }
        }

        double media = (trabalho * 0.4) + (prova * 0.6);

        String situacao;

        if (media >= 6) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        String resultado = "Média final: " + media + "\nSituação: " + situacao;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
