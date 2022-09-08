/* Escreva um programa que receba 3 notas de um aluno e uma letra. Se a letra
for A, a função deve retornar a média aritmética das notas do aluno. Se for B, a
sua média ponderada (pesos: 5, 3 e 2, respectivamente). A função também deve
informar se a letra for diferente de A e B. Cálculo da média ponderada:
((nota1*5) + (nota2*3) + (nota3*2)) / 10. */

import javax.swing.JOptionPane;

public class Aula03ex04 {
    public static void main (String args []){ 

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira a nota."));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda a nota."));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira a nota."));
        String letra = JOptionPane.showInputDialog("Digite uma letra:");
        double media;


        if (letra.equals("A")) {
            media = (nota1+nota2+nota3)/ 3;
            JOptionPane.showMessageDialog(null, "O valor da média é: " + media );
        } else if (letra.equals("B")) {
            media = ((nota1*5) + (nota2*3) + (nota3*2)) / 10;
            JOptionPane.showMessageDialog(null, "O valor da média ponderada foi de: " + media );
        } else {
            JOptionPane.showMessageDialog(null, "A letra digitada não foi nem A e nem B.");
        }
    }
}