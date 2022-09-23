import javax.swing.JOptionPane;

public class Aula05ex2 {

    public static void main(String[] args) {
        int numero = 9;
        
        /*do{   
            JOptionPane.showMessageDialog(null, numero);
            
            numero--;
            
        }while(numero >= 0);*/
        
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, numero);
            numero--;
        }
        
        /*for(int numero = 9; numero >= 0; numero--){
            JOptionPane.showMessageDialog(null, numero);
        }*/
    }
}