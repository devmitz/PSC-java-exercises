import javax.swing.JOptionPane;

public class Aula05for {
    public static void main(String args[]) {
        double nota1, nota2;

        for (int contador = 1 ; contador <=5 ; contador++) {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));

            JOptionPane.showMessageDialog(null, "A média desse aluno é: " + (nota1 + nota2) / 2);
        }
    }
}
