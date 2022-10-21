package com.mycompany.hospital;

public class Medico {
    private int crm;
    private String nome;

    public Medico(String nome, int crm){
        this.nome = nome;
        this.crm = crm;
    }
    
    public void setCrm(int crm) {
        this.crm = crm;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }
}
