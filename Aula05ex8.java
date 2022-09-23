import javax.swing.JOptionPane;

public class Aula05ex8 { 
    public static void main(String args[]){

        double notaMaior = 0;
        double notaMenor = 10;
        double somatoria = 0;

        for(int i = 1; i <= 10; i++){
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + i +"º nota:"));

            if (nota > notaMaior) { 
                notaMaior = nota;
            }

            if(nota < notaMenor) {
                notaMenor = nota;
            }

            somatoria = somatoria + nota;

        }

        JOptionPane.showMessageDialog(null, "A menor nota foi de: " + notaMenor);
        JOptionPane.showMessageDialog(null, "A maior nota foi de: " + notaMaior);
        JOptionPane.showMessageDialog(null, "A média da turma foi de: " + somatoria/10);

    }
}