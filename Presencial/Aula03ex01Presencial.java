import java.util.Scanner;

public class Aula03ex01Presencial {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        int hora1, min1, hora2, min2;
        
        System.out.println("Digite a primeira hora: ");
        hora1 = leitor.nextInt();
        System.out.println("Digite o primeiro minuto: ");
        min1 = leitor.nextInt();
        System.out.println("Digite a segunda hora: ");
        hora2 = leitor.nextInt();
        System.out.println("Digite o segundo minuto: ");
        min2 = leitor.nextInt(); 
        
        /* hora1 = 12;
        min1 = 45;
        hora2 = 14;
        min2 = 40; */
        
        int minutos1 = hora1 * 60 + min1;
        int minutos2 = hora2 * 60 + min2;
        
        int minutosTotal = minutos2 - minutos1;
        
        int horaTotal = minutosTotal /60 ;
        int minutosSobrados = minutosTotal % 60;
        
        System.out.println("O tempo total decorrido foi de: " + horaTotal + ":" + minutosSobrados);
    }
    
}
