//Calcular o pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 5% do total da venda e que você tem os seguintes dados:
//preço unitário da peça e quantidade vendida.

import javax.swing.JOptionPane;

public class Aula02ex03{
    public static void main (String[] args) {
        double comissao, totalDaVenda, precoUnitario, qntdVendida;

        precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do preço unitário: "));
        qntdVendida = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de produtos vendidos: "));

        totalDaVenda = qntdVendida * precoUnitario;
        
        comissao = 0.05 * totalDaVenda;

        JOptionPane.showMessageDialog(null, "O total da venda foi de: " + totalDaVenda + " e a sua comissão será de: " + comissao);
    }
}