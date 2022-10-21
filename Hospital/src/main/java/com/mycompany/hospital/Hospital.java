package com.mycompany.hospital;
import javax.swing.JOptionPane;

public class Hospital {
    //main
    public static void main(String[] args) {
        Paciente p = new Paciente("João", 21, 11223344);
        Medico m = new Medico("Luiz",422342342);
        Consulta d = new Consulta("22/10/2023");
        
        JOptionPane.showMessageDialog(null, "A consulta do "  + p.getNome() + " é no dia " 
                + d.getData() + " com o médico " + m.getNome() + ".");
    }
    
    
}

