/*Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior,
segundo a legislação brasileira. Escreva uma versão com if/else e outra com o
operador ternário. */

import javax.swing.JOptionPane;

public class Aula03ex02OT {
    public static void main(String args []) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qauntos anos você tem???"));
        String podeDirigir;

         podeDirigir = idade >= 18 ? "Sim, você ja pode dirigir." : "Não, você não pode dirigir.";

         JOptionPane.showMessageDialog(null, podeDirigir);
    }
}
