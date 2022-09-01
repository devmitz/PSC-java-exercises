//Ler o número total de eleitores de um município, o número de votos brancos, nulos e
//válidos. Calcular e escrever o percentual que cada um representa em relação ao total de
//eleitores.

import javax.swing.JOptionPane;

public class Aula02ex08 {
    public static void main(String[] args ) {
        int totalEleitores, votosBrancos, votosNulos, votosValidos;
        double percentualBrancos, percentualNulos, percentualValidos;

        totalEleitores = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de eleitores em seu município: "));
        votosBrancos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos em branco: "));
        votosNulos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos nulos: "));
        votosValidos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos validos: "));

        percentualBrancos = (votosBrancos * 100) / totalEleitores;
        percentualNulos = (votosNulos * 100) / totalEleitores;
        percentualValidos = (votosValidos * 100 ) / totalEleitores;

        JOptionPane.showMessageDialog(null, "O percentual de votos em branco foi de: " + percentualBrancos + 
                                                            " , o percentual de votos em nulo foi de : " + percentualNulos + 
                                                            " e o percentual de votos validos foi de : " + percentualValidos);
    }
}