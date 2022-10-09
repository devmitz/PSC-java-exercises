package Aula07;

public class Personagem {
    private String nome;
    private int energia, fome, sono;

    public Personagem(int energia, int fome, int sono){
        if(energia >=0 && energia <=10 )
            this.energia = energia;
        if(fome >=0 && fome <=10 )
            this.fome = fome;
        if(sono >=0 && sono <=10 )
            this.sono = sono;
    }

    public Personagem(String nome, int energia, int fome, int sono){
        this(energia, fome, sono);
        this.nome = nome;
    }

/*
 * 
 * ações
 * 
 */

    void cacar(){ 

        if (energia >= 2){
            System.out.println(nome + " está caçando.");
            energia -= 2;
        } else {
            System.out.println(nome + " está sem energia para caçar.");
        }

        fome = Math.min(fome+1, 10);
        sono = Math.min(sono+1, 10);
        exibirEstado();
    }

    void comer(){
        if(fome >= 1){
            System.out.println(nome + " está comendo.");
            energia = Math.min(energia+1, 10);
            fome--;
        } else {
            System.out.println(nome + " está sem fome.");
        }
        exibirEstado();
    }

    void dormir(){
        if(sono >= 1){
            System.out.println(nome + " está dormindo.");
            energia = Math.min(energia+1, 10);
            sono--;
        } else {
            System.out.println(nome + " está sem sono.");
        }
        exibirEstado();
    }
/*
 * 
 * get:
 * 
 */
    public String getNome(){
        return nome;
    }

    public int getEnergia(){
        return energia;
    }

    public int getFome(){
        return fome;
    }
    
    public int getSono(){
        return sono;
    }
/*
 *
 *  set:
 * 
 */
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public void setFome(int fome){
        this.fome = fome;
    }

    public void setSono(int sono){
        this.sono = sono;
    }

    /*
     * 
     * ex 01
     * 
     */

    void exibirEstado() {
        System.out.println("Nome: " + nome + " Energia: " + energia + " Fome: " + fome + " Sono: " + sono);
    }
}