//Ler um valor inteiro e exibir seu antecessor.

import javax.swing.JOptionPane;

public class Aula02ex04{
    public static void main (String[] args) {
        int valorInteiro, antecessor;
        valorInteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de valor inteiro: "));
        antecessor = valorInteiro - 1;
        JOptionPane.showMessageDialog(null, "O número antecessor de " + valorInteiro + " é de: " + antecessor);
    }
}
