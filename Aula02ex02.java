//Ler 4 números, calcular o quadrado para cada um, somar todos os quadrados e mostrar o resultado.

import javax.swing.JOptionPane;

public class Aula02ex02 {
    public static void main (String[] args) {
        double primeiroValor, segundoValor, terceiroValor, quartoValor, resultado;

        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        terceiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        quartoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor: "));

        resultado = (primeiroValor*primeiroValor) + (segundoValor*segundoValor) + (terceiroValor*terceiroValor) + (quartoValor*quartoValor);

        JOptionPane.showMessageDialog(null, "A soma dos quadrados dos 4 valores digitados foi: " + resultado);
    }
}