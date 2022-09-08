/* Escreva um programa que obtém o salário de uma pessoa e diz se ela está ganhando
pelo menos o salário mínimo (R$ 1.212).*/

import javax.swing.JOptionPane;

public class Aula03ex01 {

    public static void main (String args []) {
        double salario;
        salario = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Digite o salário: "));

        if (salario >= 1212) {
            JOptionPane.showMessageDialog(null, "Você está ganhando mais do que um salário mínimo.");
        } 
        else {
            JOptionPane.showMessageDialog(null, "Você está ganhando menos do que um salário mínimo.");
        }
    }
}