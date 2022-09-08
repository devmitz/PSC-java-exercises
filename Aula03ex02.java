/*Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior,
segundo a legislação brasileira. Escreva uma versão com if/else e outra com o
operador ternário. */

import javax.swing.JOptionPane;

public class Aula03ex02 {
    public static void main (String args []) {
        double idade;
        idade = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua idade: "));

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você ja é de maior segundo a legislação brasileira.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Você é de menor idade segundo a legislação brasileira.");
        }
    }
}
