package com.saojudas.conversor;

import static com.saojudas.conversor.ConversorDeTemperatura.criarTela;
import javax.swing.SwingUtilities;

public class Conversor {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
    }
}
