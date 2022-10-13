import javax.swing.JOptionPane;

public class Aula05ex7 {
    public static void main(String args[]){

        int idadeMenor15 = 0;
        int idadeAte30 = 0;
        int idadeAte45 = 0;
        int idadeMaior50 = 0;

        for(int i = 1 ; i<= 10; i++) {

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da " + i + "º pessoa:"));

            if( idade <= 15) {
                idadeMenor15++;
            }

            if( idade <= 30) {
                idadeAte30++;
            }

            if( idade <= 45) {
                idadeAte45++;
            }

            if ( idade >= 50 ) {
                idadeMaior50++;
            }
        }

        JOptionPane.showMessageDialog(null, "O número total de pessoas com idade de até 15 anos são: " + idadeMenor15 + " pessoas.");
        JOptionPane.showMessageDialog(null, "O número total de pessoas com idade de 16 anos até 30 anos são: " + idadeAte30 + " pessoas.");
        JOptionPane.showMessageDialog(null, "O número total de pessoas com idade de 31 anos até 45 anos são: " + idadeAte45 + " pessoas.");
        JOptionPane.showMessageDialog(null, "O número total de pessoas com idade de maior 50 anos são: " + idadeMaior50 + " pessoas.");

    }
}
