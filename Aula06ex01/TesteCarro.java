package Aula06ex01;

import javax.swing.JOptionPane;

public class TesteCarro {
    public static void main(String args[]) {
        
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        String nome1 = JOptionPane.showInputDialog("Digite o nome do primeiro carro:");
        String cor1 = JOptionPane.showInputDialog("Digite a cor do primeiro carro:");

        String nome2 = JOptionPane.showInputDialog("Digite o nome do segundo carro:");
        String cor2 = JOptionPane.showInputDialog("Digite a cor do segundo carro:");

        carro1.setCorCarro(cor1);
        carro1.setNomeCarro(nome1);

        carro2.setCorCarro(cor2);
        carro2.setNomeCarro(nome2);

        JOptionPane.showMessageDialog(null, "As informações do primeiro carro são: " + carro1.getNomeCarro() + " " + carro1.getCorCarro());
        JOptionPane.showMessageDialog(null, "As informações do segundo carro são: " + carro2.getNomeCarro() + " " + carro2.getCorCarro());
    }
}