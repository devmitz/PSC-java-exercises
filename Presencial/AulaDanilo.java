
import java.util.Scanner;

public class AulaDanilo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String clienteCadastrado = "admin";
        String senhaCadastrada = "admin";
        
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        /*
        System.out.println("Digite seu horario: ");
        String horario = input.nextLine();
        */
        System.out.println("Digite a sua senha: ");
        String senha = input.nextLine();
        /*
        System.out.println("Digite o seu cargo: ");
        String cargo = input.nextLine();
        
        System.out.println("Digite o seu telefone: ");
        String telefone = input.nextLine();
        */
        System.out.println("Digite o seu login: ");
        String login = input.nextLine();
        
        if (login.equals(clienteCadastrado) && senha.equals(senhaCadastrada)) {
            System.out.println("Seja bem vindo " + nome);
        }
        
        if (login.equals(clienteCadastrado) == false ) {
            System.out.println("Nome de usuario não cadastrado.");
        }
        
        if (login.equals(clienteCadastrado) == true && senha.equals(senhaCadastrada) == false) {
            System.out.println("Senha incorreta.");
        }
        
    }
}
