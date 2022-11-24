import javax.swing.JOptionPane;

public class repeticaoFor {
    public static void main(String args[]){
        for(int contador = 1; contador <= 10; contador++){
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota:"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota:"));

            double media = (nota1 + nota2)/2;

            JOptionPane.showMessageDialog(null, "A sua média foi de: " + media);
        }
    }
}
