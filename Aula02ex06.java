//Ler a idade de uma pessoa expressa em anos e exibir expressa em dias (considere que um ano tem 365 dias).

import javax.swing.JOptionPane;

public class Aula02ex06 {
    public static void main (String[] args) {
        int idade, dias;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        
        dias = idade * 365;
        
        JOptionPane.showMessageDialog(null, "De acordo com a sua idade você tem aproximadamente: " + dias + " dias de vida.");
    }
}