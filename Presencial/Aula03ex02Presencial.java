
import java.util.Scanner;

public class Aula03ex02Presencial {
    
    public static void main (String args []) {
        
        Scanner leitor = new Scanner (System.in);
        
        int numero1, numero2, numero3;
        
        System.out.println("Digite o seu primeiro número");
        numero1 = leitor.nextInt();
        System.out.println("Digite o seu segundo número");
        numero2 = leitor.nextInt();
        System.out.println("Digite o seu terceiro número");
        numero3 = leitor.nextInt();
        
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número foi o primeiro digitado: " + numero1);
        } else if ( numero2 > numero3 ) {
            System.out.println("O maior número foi o segundo digitado: " + numero2);
        } else {
            System.out.println("O maior número foi o terceiro digitado: " + numero3);
        }
        
    }
}
