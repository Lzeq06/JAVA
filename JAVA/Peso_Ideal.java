/*
 * Exercício 4 - Peso Ideal (Função VOID)
 */

import javax.swing.JOptionPane;

public class Exercicio4_PesoIdeal {

    public static void calcularPesoIdeal(double altura, String sexo) {
        double pesoIdeal;
        
        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("MASCULINO")) {
            pesoIdeal = (72.7 * altura) - 58;
            JOptionPane.showMessageDialog(null, 
                "Sexo: Masculino\n" +
                "Altura: " + altura + " m\n" +
                "Peso ideal: " + String.format("%.2f", pesoIdeal) + " kg");
        } 
        else if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("FEMININO")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            JOptionPane.showMessageDialog(null, 
                "Sexo: Feminino\n" +
                "Altura: " + altura + " m\n" +
                "Peso ideal: " + String.format("%.2f", pesoIdeal) + " kg");
        }
        else {
            JOptionPane.showMessageDialog(null, 
                "Sexo inválido! Digite M (masculino) ou F (feminino)");
        }
    }
    
    public static void main(String[] args) {
        String alturaStr = JOptionPane.showInputDialog("Digite sua altura (em metros):");
        double altura = Double.parseDouble(alturaStr);
        
        String sexo = JOptionPane.showInputDialog("Digite seu sexo:\nM - Masculino\nF - Feminino");
        
        calcularPesoIdeal(altura, sexo);
    }
}