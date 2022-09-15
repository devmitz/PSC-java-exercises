/* Escreva um algoritmo que dada a idade de um nadador classifica-o em uma das seguintes
categorias:
infantil A = 5 - 7 anos
infantil B = 8 - 10 anos
juvenil A = 11-13 anos
juvenil B = 14-17 anos
adulto = maiores de 18 anos */

import javax.swing.JOptionPane;

public class Aula04ex08 {
    public static void main(String args[]) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador: "));

        if(idade < 5){
            JOptionPane.showMessageDialog(null, "A idade do nadador não está catalogada, por motivos de você ser menor do que 5 anos.");
        } else if( idade <= 7 ) {
            JOptionPane.showMessageDialog(null, "A idade do nadador está catalogada como Infantil A. ");
        }else if( idade <= 10 ) {
            JOptionPane.showMessageDialog(null, "A idade do nadador está catalogada como Infantil B. ");
        }else if( idade <= 13 ) {
            JOptionPane.showMessageDialog(null, "A idade do nadador está catalogada como Juvenil A. ");
        }else if( idade <= 17 ) {
            JOptionPane.showMessageDialog(null, "A idade do nadador está catalogada como Juvenil B. ");
        }else if( idade >= 18 ) {
            JOptionPane.showMessageDialog(null, "A idade do nadador está catalogada como Adulto. ");
        }
    }
}
