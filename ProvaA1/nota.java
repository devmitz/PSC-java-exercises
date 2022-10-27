import javax.swing.JOptionPane;

public class nota {
    public static void main(String args[]){
        String conceitoA = "Aprovado pelo conceito A";
        String conceitoB = "Aprovado pelo conceito B";
        String conceitoC = "Aprovado pelo conceito C";
        String reprovado = "Reprovado";

        double notaUm = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota do aluno:"));
        double notaDois = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota do aluno:"));
        double notaTres = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota do aluno:"));

        int falta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de faltas do aluno:"));

        double media = (notaUm + notaDois + notaTres)/3;

        if(falta>=10){
            JOptionPane.showMessageDialog(null, reprovado + " pelo número alto de faltas. \n Número de faltas total: " + falta);
        }else{
            if ( media > 10 ) {
                JOptionPane.showMessageDialog(null, "A nota não esta entre 0 e 10.");
            } else if (media >= 9) {
                JOptionPane.showMessageDialog(null, conceitoA);
            } else if (media >= 7 ) {
                JOptionPane.showMessageDialog(null, conceitoB);
            } else if (media >= 5 ) {
                JOptionPane.showMessageDialog(null, conceitoC);
            } else if (media >= 0 ) {
                JOptionPane.showMessageDialog(null, reprovado + " pela média ser menos do que 5");
            } else {
                JOptionPane.showMessageDialog(null, "A nota não esta entre 0 e 10.");
            }
        }
    }
}