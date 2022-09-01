//Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a idade dessa pessoa
//expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import javax.swing.JOptionPane;

public class Aula02ex07 {
    public static void main(String[] args) {
        int anoAniversario, mesAniversario, diaAniversario, anoAtual, mesAtual, diaAtual, idadeDias;

        anoAniversario = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você nasceu: "));
        mesAniversario = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes em que você nasceu: "));
        diaAniversario = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia em que você nasceu: "));

        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano ATUAL: "));
        mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes ATUAL "));
        diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia ATUAL: "));


        idadeDias = ((anoAtual - anoAniversario) *365 ) + ((mesAtual - mesAniversario) *30) + (diaAtual - diaAniversario);

        JOptionPane.showMessageDialog(null, "Você tem o total de " + idadeDias + " dias de vida.");
    }
}
