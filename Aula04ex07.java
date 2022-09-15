/* Escreva um algoritmo que leia o nome, o sexo (“F” ou “M”) e o estado civil de uma pessoa.
Caso sexo seja “F” e estado civil seja “CASADA”, solicitar também o tempo de casada (anos).
Por fim, o algoritmo deve imprimir todas as informações digitadas pelo usuário. Utilize
variáveis do tipo String e o método String.equals() para comparação. */

import javax.swing.JOptionPane;

public class Aula04ex07 {
    public static void main(String args[]) {
        
        String sexo = JOptionPane.showInputDialog("Digite o seu sexo (M/F): ");
        String estadoCivil = JOptionPane.showInputDialog("Digite o seu estado civil (SOLTEIRA/CASADA): ");

        if (sexo.equals("F") && estadoCivil.equals("CASADA")) {
            int tempoCasada = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu tempo de casada: "));
            JOptionPane.showMessageDialog(null, "Você é do sexo " + sexo + ", seu estado civil está como " + estadoCivil + " e está a " +  tempoCasada + " anos casada.");
        } else {
            JOptionPane.showMessageDialog(null, "Você é do sexo " + sexo + " e seu estado civil está como " + estadoCivil);
        }
    }
}
