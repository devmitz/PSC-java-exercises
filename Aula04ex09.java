/* 9. Escreva um algoritmo que receba um número de 1 até 12 e retorne o mês correspondente
(1 para Janeiro, 2 para Fevereiro e etc). O algoritmo deve escrever a mensagem “Mês inválido”
caso o número não esteja entre 1 e 12. */

import javax.swing.JOptionPane;

public class Aula04ex09 {
    public static void main(String args[]){
        
        int mesInput = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 12 para saber o mês correspondente."));

        if(mesInput == 1) {
            JOptionPane.showMessageDialog(null,"O numero digitado é correspondente ao mês de JANEIRO.");
        }else if(mesInput == 2) {
            JOptionPane.showMessageDialog(null,"O numero digitado é correspondente ao mês de FEVEREIRO.");
        }else if(mesInput == 3) {
            JOptionPane.showMessageDialog(null,"O numero digitado é correspondente ao mês de MARÇO.");
        }else if(mesInput == 4) {
            JOptionPane.showMessageDialog(null,"O numero digitado é correspondente ao mês de ABRIL.");
        }else if(mesInput == 5) {
            JOptionPane.showMessageDialog(null,"O numero digitado é correspondente ao mês de MAIO.");
        }else if(mesInput == 6) {
            JOptionPane.showMessageDialog(null,"O numero digitado é correspondente ao mês de JUNHO.");
        }else if(mesInput == 7) {
            JOptionPane.showMessageDialog(null,"O numero digitado é correspondente ao mês de JULHO.");
        }else if(mesInput == 8) {
            JOptionPane.showMessageDialog(null,"O numero digitado é correspondente ao mês de AGOSTO.");
        }else if(mesInput == 9) {
            JOptionPane.showMessageDialog(null,"O numero digitado é correspondente ao mês de SETEMBRO.");
        }else if(mesInput == 10) {
            JOptionPane.showMessageDialog(null,"O numero digitado é correspondente ao mês de OUTUBRO.");
        }else if(mesInput == 11) {
            JOptionPane.showMessageDialog(null,"O numero digitado é correspondente ao mês de NOVEMBRO.");
        }else if(mesInput == 12) {
            JOptionPane.showMessageDialog(null,"O numero digitado é correspondente ao mês de DEZEMBRO.");
        } else {
            JOptionPane.showMessageDialog(null,"Mês inválido.");
        }

    }
}
