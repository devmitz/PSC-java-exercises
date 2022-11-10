package com.saojudas.conversor;

import java.awt.*;
import javax.swing.*;

public class ConversorDeTemperatura {
    public static void criarTela(){
        JFrame tela = new JFrame("Conversor");
        JTextField celsiusTextField = new JTextField(10); //10 = caracteres maximos
        JLabel celsiusLabel = new JLabel("\u00B0C"); //bolinha do grau + C
        JButton convertButton = new JButton("Converter");
        JLabel valorConvertidoLabel = new JLabel("");
        
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2,2,4,4));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(convertButton);
        painelDeConteudo.add(valorConvertidoLabel);
        
        convertButton.addActionListener((e) -> {
           double celsius = Double.parseDouble(celsiusTextField.getText()); 
           double fahrenheit = celsius/5*9+32;
           
           valorConvertidoLabel.setText(String.format("%.2f\u00B0F", fahrenheit));
        });
        
        //ajustar a largura e altura de acordo com o conteudo
        tela.pack();
        //centralizar tela
        tela.setLocationRelativeTo(null);
        //alterar o comportamento do botão fechar para que o app termine ao clicar nesse botão
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //tornar ela visivel
        tela.setVisible(true);
    }  
}
