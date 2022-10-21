package com.mycompany.hospital;

public class Paciente {
    private String nome;
    private int telefone;
    private int idade;
    
    public Paciente(String nome, int idade, int telefone){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }
}
