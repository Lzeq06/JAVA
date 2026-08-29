/*
 * EXERCÍCIO 6:
 * Escreva um programa para ler um valor e escrever a soma da sua tabuada de 1 até 10
 * Ex: Digite Numero: 5
 * Soma da Tabuada = 275
 * 
 * Explicação do exemplo com número 5:
 * Tabuada do 5: 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
 * Soma: 5+10+15+20+25+30+35+40+45+50 = 275
 */

package com.mycompany.soma_tabuada;
import javax.swing.JOptionPane;

public class Soma_tabuada {

   
    public static int calcularSomaTabuada(int numero) {
        
    
        // Começa com ZERO porque ainda não somamos nada
        int soma = 0;
        
       
        // for - estrutura que repete um bloco de código várias vezes
        // int i = 1 - variável contadora começa em 1 (primeiro múltiplo)
        // i <= 10 - continua enquanto i for menor ou igual a 10
        // i++ - depois de cada volta, aumenta i em 1 (i = i + 1)
        for (int i = 1; i <= 10; i++) {
            
            // PASSO 3: ACUMULAR (SOMAR) O MÚLTIPLO ATUAL AO TOTAL
            // numero * i = múltiplo atual
            // soma = soma + (numero * i)
            // Exemplo com numero=5:
            // i=1: soma = 0 + (5×1=5) = 5
            // i=2: soma = 5 + (5×2=10) = 15
            // i=3: soma = 15 + (5×3=15) = 30
            // ... e assim por diante até i=10
            soma = soma + (numero * i);
        }
        
       
        // Depois que o for terminar (i = 11), a soma está completa
        // Ex: se numero = 5, soma = 275
        return soma;
        
    } 
    
   
    public static void main(String[] args) {
        

        int numero;      // guarda o número digitado pelo usuário
        int resultado;   // guarda a soma da tabuada (resultado da função)
        
      
        String numeroStr = JOptionPane.showInputDialog("Digite um número:");
        // Converter texto para número INTEIRO (Integer.parseInt)
        numero = Integer.parseInt(numeroStr);
        
      
        // A função calcularSomaTabuada RETORNA um valor (int)
        // Este valor é ARMAZENADO na variável resultado
        resultado = calcularSomaTabuada(numero);
                // PASSO 8: EXIBIR O RESULTADO
        JOptionPane.showMessageDialog(null, 
          
            "Número digitado: " + numero + "\n" +
            "Soma da tabuada de 1 até 10 = " + resultado);
        
    } 
} 