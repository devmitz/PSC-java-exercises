/* Escreva um programa que receba dois números e um operador aritmético (do tipo
String) entre * (multiplicação), + (soma) ou – (subtração). O programa deve então
retornar a operação matemática correspondente ao usuário. Caso o operador digitado
não seja um dos citados, o programa deve retornar a mensagem “Operador Inválido”. */

import javax.swing.JOptionPane;

public class Aula03ex06 {
    public static void main (String args []) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        String operador = JOptionPane.showInputDialog("Digite o operador.");
        double resultado = 0;

        switch(operador) {
            case "*" :
                resultado = numero1*numero2;
                break;
            case "+" :
                resultado = numero1+numero2;
                break;
            case "-" :
                resultado = numero1-numero2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "O operador digitado é inválido.");
                break;
        }
        JOptionPane.showMessageDialog(null, "O resultado do cálculo é: " + resultado);
    }
}
