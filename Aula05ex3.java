import javax.swing.JOptionPane;

public class Aula05ex3 {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int resultado = numero;
        
        while (numero > 1){
            resultado = resultado*(numero-1);
            numero--;
        }
        
        JOptionPane.showMessageDialog(null,resultado);
    }
}