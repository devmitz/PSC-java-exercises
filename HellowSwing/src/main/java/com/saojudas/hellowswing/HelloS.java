package com.saojudas.hellowswing;
import java.awt.Container;
import javax.swing.*;

public class HelloS {
    public static void criarTela(){
        JFrame tela = new JFrame ("Hello, Swing!!!");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //inserindo o label
        JLabel helloSwingLabel = new JLabel("Hello, Swing Label!!!!");
        
        Container painelDeConteudo = tela.getContentPane();
        
        //adicionar JLabel no Container
        painelDeConteudo.add(helloSwingLabel);
        
        tela.pack();
        tela.setVisible(true);
    }
}