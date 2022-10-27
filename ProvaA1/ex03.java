import java.util.Scanner;

public class ex03 {

    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int z = 0;

        int N = ler.nextInt();

        System.out.print("0");
        for(int i = 1; i <= N ; i++){

            for(int j=1; j<=i ; j++){
                System.out.print(i);
                z++;
            }
        }
        int length = z + 1;
        System.out.println("\n" + length);
    }
}
