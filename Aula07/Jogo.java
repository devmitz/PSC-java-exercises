package Aula07;

import javax.swing.JOptionPane;

public class Jogo {
    

    public static void main(String args[]){

        Personagem cacador = new Personagem("John", 10, 0 , 0);
        Personagem soneca = new Personagem("Soneca", 10, 3, 2);

        int escolhaPersonagem = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o personagem que você ira utilizar: \n 1- John \n 2- Soneca"));
        
        if (escolhaPersonagem == 1) {
            while(cacador.getSono() >= 0 && cacador.getFome() >= 0 && cacador.getEnergia() <= 10 && cacador.getEnergia() >= 1){
                int resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada: \n 1- Caçar \n 2- Comer \n 3- Dormir"));
    
                if (resposta == 1 )
                    cacador.cacar();
                if (resposta == 2)
                    cacador.comer();
                if (resposta == 3)
                    cacador.dormir();
            }
        }
        if (escolhaPersonagem == 2){
            while(soneca.getSono() >= 0 && soneca.getFome() >= 0 && soneca.getEnergia() <= 10 && soneca.getEnergia() >= 1){
                int resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada: \n 1- Caçar \n 2- Comer \n 3- Dormir"));
    
                if (resposta == 1 )
                    soneca.cacar();
                if (resposta == 2)
                    soneca.comer();
                if (resposta == 3)
                    soneca.dormir();
            }
        }
    }
}