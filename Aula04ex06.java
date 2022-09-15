/* 6. Escreva um algoritmo que leia três valores (A, B e C) e imprima na tela se a soma de A + B é
menor que C. */

import javax.swing.JOptionPane;

public class Aula04ex06 {
    public static void main(String args[]){
        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        int C = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));

        if(A + B < C) {
            JOptionPane.showMessageDialog(null, "A soma de A + B é menor do que C.");
        } else {
            JOptionPane.showMessageDialog(null, "A soma de A + B é maior do que C.");
        }
    }
}
