import javax.swing.JOptionPane;

public class repeticao {
    public static void main(String args[]){
        int contador = 1;

        while(contador <= 10){
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota:"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota:"));

            double media = (nota1 + nota2)/2;

            JOptionPane.showMessageDialog(null, "A sua média foi de: " + media);

            contador++;
        }
    }
}
