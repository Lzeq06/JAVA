/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



//- Objetivo: ler a idade de uma pessoa e informar sua classe eleitoral.
//- Regras:
//  - Não-eleitor: abaixo de 16 anos
//  - Eleitor obrigatório: entre 18 e 65 anos
//  - Eleitor facultativo: entre 16 e 18 anos (inclusive 16 e 17) e maior de 65 anos
//  - Entradas: idade.
//  - Saída: classe eleitoral.




package com.mycompany.classe_eleitoral;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class Classe_eleitoral {

    public static void main(String[] args) {
       
   int idade;

        idade = Integer.parseInt(
                JOptionPane.showInputDialog("Digite sua idade:")
        );

        if (idade < 16) {
            JOptionPane.showMessageDialog(null, "Classe eleitoral: Não-eleitor");
        }
        else if (idade >= 16 && idade < 18) {
            JOptionPane.showMessageDialog(null, "Classe eleitoral: Eleitor facultativo");
        }
        else if (idade >= 18 && idade <= 65) {
            JOptionPane.showMessageDialog(null, "Classe eleitoral: Eleitor obrigatório");
        }
        else {
            JOptionPane.showMessageDialog(null, "Classe eleitoral: Eleitor facultativo");
        }
    }
}