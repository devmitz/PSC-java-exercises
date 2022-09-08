/*Escreva um programa que receba um número inteiro e retorne a mensagem
"Este número é Par"; se o número for Par ou retorne "Este número é Ímpar"; se o
número for ímpar. Utilize a operação de resto de divisão %. */

import javax.swing.JOptionPane;

public class Aula03ex03 {
    public static void main (String args []) {
        int numeroInt;

        numeroInt = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numeroInt % 2 == 0 ) {
            JOptionPane.showMessageDialog(null,"Seu número é par.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Seu número é impar.");
        }
    }
}