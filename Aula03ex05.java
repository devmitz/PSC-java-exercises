
/* Escreva um programa que receba a nota de um aluno (0 até 10) e imprima seu
conceito de acordo com a tabela: 
O programa também deve avisar o usuário caso a nota não esteja entre 0 e 10.*/

import javax.swing.JOptionPane;

public class Aula03ex05 {
    public static void main (String args []) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno: "));

        if (nota > 10 ) {
            JOptionPane.showMessageDialog(null, "A nota não esta entre 0 e 10.");
        } else if (nota >= 9) {
            JOptionPane.showMessageDialog(null, "Conceito A");
        } else if (nota >= 7 ) {
            JOptionPane.showMessageDialog(null, "Conceito B");
        } else if (nota >= 5 ) {
            JOptionPane.showMessageDialog(null, "Conceito C");
        } else if (nota >= 0 ) {
            JOptionPane.showMessageDialog(null, "Conceito D");
        } else {
            JOptionPane.showMessageDialog(null, "A nota não esta entre 0 e 10.");
        }
    }
}
