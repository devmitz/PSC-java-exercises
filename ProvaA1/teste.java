package ProvaA1;
import javax.swing.JOptionPane;

public class teste {
    public static void main(String args[]){
        //primeiro usuário
        String nomeUsuario = JOptionPane.showInputDialog(null, "Escolha o nome do primeiro usuário:");
        int idadeUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a idade do primeiro usuário:"));
        String sexoUsuario = JOptionPane.showInputDialog(null, "Escolha o sexo do primeiro usuário:");
        //segundo usuário
        String nomeUsuarioDois = JOptionPane.showInputDialog(null, "Escolha o nome do segundo usuário:");
        int idadeUsuarioDois = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a idade do segundo usuário:"));
        String sexoUsuarioDois = JOptionPane.showInputDialog(null, "Escolha o sexo do segundo usuário:");

        //construtor colocando as informações setadas pelo usuário
        Humano userUm = new Humano(nomeUsuario, idadeUsuario, sexoUsuario);
        Humano userDois = new Humano(nomeUsuarioDois, idadeUsuarioDois, sexoUsuarioDois);

        //exibe as informações dos dois usuário
        JOptionPane.showMessageDialog(null, "O usuário DOIS tem as respectivas informações: \n" 
        + userUm.getNome() + "\n" + userUm.getIdade() + " anos \n"  + userUm.getSexo());

        JOptionPane.showMessageDialog(null, "O usuário UM tem as respectivas informações: \n" 
        + userDois.getNome() + "\n" + userDois.getIdade() + " anos \n"  + userDois.getSexo());

        //setando informações setadas pelo programador
        userUm.setNome("Felipe");
        userUm.setIdade(18);
        userUm.setSexo("Masculino");

        userDois.setNome("Danilo");
        userDois.setIdade(27);
        userDois.setSexo("Masculino");
        
        //mostrando as informações setadas pelo programador
        System.out.println(userUm.getNome());
        System.out.println(userUm.getIdade()+" anos");
        System.out.println(userUm.getSexo());

        System.out.println("===========================");

        System.out.println(userDois.getNome());
        System.out.println(userDois.getIdade()+" anos");
        System.out.println(userDois.getSexo());
    }
}
