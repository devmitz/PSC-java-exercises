
import javax.swing.JOptionPane;

public class pomar {

    public static void main(String[] args) {
        String clienteCadastrado = "admin";
        String senhaCadastrada = "admin";
        String nomeCadastrado = "admin";

        int loginCadastro = Integer.parseInt(JOptionPane.showInputDialog("Já é cadastrado? \n 1- Sim\n 2- Não"));

        if (loginCadastro == 2){
            String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
            String cargo = JOptionPane.showInputDialog("Digite o seu cargo: ");
            String login = JOptionPane.showInputDialog("Digite o seu login: ");
            String senha= JOptionPane.showInputDialog("Digite a sua senha: ");
            String telefone = JOptionPane.showInputDialog("Digite o seu telefone: ");
            String horario = JOptionPane.showInputDialog("Digite o horario escolhido: ");

            JOptionPane.showMessageDialog(null,  nome + " seu cadastro foi criado com sucesso.");
        }
        
        if( loginCadastro == 1){

            String login = JOptionPane.showInputDialog("Digite o seu login: ");
            String senha = JOptionPane.showInputDialog("Digite a sua senha: ");

            if (login.equals(clienteCadastrado) && senha.equals(senhaCadastrada)) {
                JOptionPane.showMessageDialog(null, "Seja bem vindo " + nomeCadastrado);
            }
            
            if (login.equals(clienteCadastrado) == false ) {
                JOptionPane.showMessageDialog(null, "Nome de usuario não cadastrado.");
            }
            
            if (login.equals(clienteCadastrado) == true && senha.equals(senhaCadastrada) == false) {
                JOptionPane.showMessageDialog(null, "Senha incorreta.");
            }
        }
    }
}