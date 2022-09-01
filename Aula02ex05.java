//Ler as dimensões de um retângulo (base e altura), calcular e escrever a área de retângulo.

import javax.swing.JOptionPane;

public class Aula02ex05 {
    public static void main (String[] args) {
        double base, altura, resultado;
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do retângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do retângulo: "));
        resultado = base * altura;
        JOptionPane.showMessageDialog(null, "A área total do retângulo é de " + resultado + " metros quadrados.");
    }
}
