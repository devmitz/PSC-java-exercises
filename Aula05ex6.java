import javax.swing.JOptionPane;

public class Aula05ex6 {
    public static void main(String args[]) {
        int idadeMaior = 0;

        for(int i = 1 ; i <= 10 ; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + i + "º idade: "));

            if(idade >= 18) {
                idadeMaior++;
            }
        }

        JOptionPane.showMessageDialog(null, "O número de idades maior do que 18 anos é: " + idadeMaior);

    }
}
