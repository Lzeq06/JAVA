/*
 * Exercício 3 - Verificação de Triângulo
 */

import javax.swing.JOptionPane;

public class Exercicio3_VerificacaoTriangulo {

    public static String verificarTriangulo(double x, double y, double z) {
        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z) {
                return "Triângulo Equilátero";
            } else if (x == y || x == z || y == z) {
                return "Triângulo Isósceles";
            } else {
                return "Triângulo Escaleno";
            }
        } else {
            return "Não forma um triângulo";
        }
    }

    public static void main(String[] args) {
        String xStr, yStr, zStr;
        double x, y, z;

        xStr = JOptionPane.showInputDialog("Digite o lado X:");
        yStr = JOptionPane.showInputDialog("Digite o lado Y:");
        zStr = JOptionPane.showInputDialog("Digite o lado Z:");

        x = Double.parseDouble(xStr);
        y = Double.parseDouble(yStr);
        z = Double.parseDouble(zStr);

        String resultado = verificarTriangulo(x, y, z);

        JOptionPane.showMessageDialog(null, resultado);
    }
}