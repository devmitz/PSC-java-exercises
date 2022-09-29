package Aula06ex01;

public class Carro {
    private String nomeCarro;
    private String corCarro;

    public void setNomeCarro(String nomeCarro){
        this.nomeCarro = nomeCarro;
    }

    public void setCorCarro(String corCarro){
        this.corCarro = corCarro;
    }
    
    public String getNomeCarro(){
        return nomeCarro;
    }
    
    public String getCorCarro(){
        return corCarro;
    }
}