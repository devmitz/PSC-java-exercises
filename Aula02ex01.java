//Ler a cotação do dólar e a quantidade de dólares. Converter para real e mostrar o resultado.

import javax.swing.JOptionPane;

public class Aula02ex01 {
    public static void main (String[] args) {
        // declaração de variáveis.
        double cotacaoDolar, valorDolar, valorReal;

        // entrada de dados.
        cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cotação do Dolar: "));
        valorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em Dolar: "));
        // até essa parte ele só pegou os números digitados.
        
        // processamento de dados.
        valorReal = valorDolar * cotacaoDolar;
        
        //saída de dados.
        JOptionPane.showMessageDialog(null, "O valor convertido de Dolar para Real é: " + valorReal);
    }
}