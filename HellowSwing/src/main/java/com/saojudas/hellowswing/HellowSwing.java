package com.saojudas.hellowswing;
import static com.saojudas.hellowswing.HelloS.criarTela;
import javax.swing.SwingUtilities;

public class HellowSwing {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
    }
}
