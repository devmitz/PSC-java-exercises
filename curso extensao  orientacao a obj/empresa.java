import javax.swing.JOptionPane;

public class empresa {
    public static void main(String args[]){
        funcionario funci1 = new funcionario("João", 31, "Dono");

        funcionario funci2 = new funcionario("Roberto ", 21, "Lojista");

        funcionario funci3 = new funcionario("Maria", 46, "Recepcionista");
        
        funcionario funci4 = new funcionario("Thiago", 17, "Estagiario");

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para receber as informações do: \n 1- Funcionario 1\n 2- Funcionario 2\n 3- Funcionario 3\n 4- Funcionario 4"));
        
        if(opcao == 1){
            JOptionPane.showMessageDialog(null, "O funcionario 1 se chama " + funci1.getNome() + ", possui " + funci1.getIdade() + " anos e tem o cargo de: " + funci1.getCargo());
        }
        if(opcao == 2){
            JOptionPane.showMessageDialog(null, "O funcionario 2 se chama " + funci2.getNome() + ", possui " + funci2.getIdade() + " anos e tem o cargo de: " + funci2.getCargo());
        }
        if(opcao == 3){
            JOptionPane.showMessageDialog(null, "O funcionario 3 se chama " + funci3.getNome() + ", possui " + funci3.getIdade() + " anos e tem o cargo de: " + funci3.getCargo());
        }
        if(opcao == 4){
            JOptionPane.showMessageDialog(null, "O funcionario 4 se chama " + funci4.getNome() + ", possui " + funci4.getIdade() + " anos e tem o cargo de: " + funci4.getCargo());
        }
        /*else {
            JOptionPane.showMessageDialog(null, "O funcionario " + opcao + " não existe.");
        } */
    }
}
