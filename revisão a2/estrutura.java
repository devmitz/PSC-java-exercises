import javax.swing.JOptionPane;

public class estrutura{
    public static void main(String args[]){
        
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota:"));

        double media = (nota1 + nota2)/2;

        if(media >= 9){
            JOptionPane.showMessageDialog(null, "Aprovado, pelo conceito A. Sua média total foi de: " + media);
        }else if(media >= 7){
            JOptionPane.showMessageDialog(null, "Aprovado, pelo conceito B. Sua média total foi de: " + media);
        }else if(media >= 6){
            JOptionPane.showMessageDialog(null, "Aprovado, pelo conceito C. Sua média total foi de: " + media);
        }else if(media >= 0){
            JOptionPane.showMessageDialog(null, "Reprovado. Sua média total foi de: " + media);
        }
        
    }
}