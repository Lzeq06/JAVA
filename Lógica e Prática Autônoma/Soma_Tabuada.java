/*
 * Exercício 6 - Soma da Tabuada
 */

import javax.swing.JOptionPane;

public class Exercicio6_SomaTabuada {

    public static int calcularSomaTabuada(int numero) {
        int soma = 0;
        
        for (int i = 1; i <= 10; i++) {
            soma = soma + (numero * i);
        }
        
        return soma;
    }
    
    public static void main(String[] args) {
        int numero;
        int resultado;
        
        String numeroStr = JOptionPane.showInputDialog("Digite um número:");
        numero = Integer.parseInt(numeroStr);
        
        resultado = calcularSomaTabuada(numero);
        
        JOptionPane.showMessageDialog(null, 
            "Número digitado: " + numero + "\n" +
            "Soma da tabuada de 1 até 10 = " + resultado);
    }
}