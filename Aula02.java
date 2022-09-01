import javax.swing.JOptionPane;

public class Aula02 {
    public static void main (String[] args) {
        // declaração de variáveis.
        double primeiroValor, segundoValor, resultado;

        // entrada de dados.
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        // até essa parte ele só pegou os números digitados.
        
        // processamento de dados.
        resultado = primeiroValor + segundoValor;
        
        //saída de dados.
        JOptionPane.showMessageDialog(null, "soma = " + resultado);
    }
}