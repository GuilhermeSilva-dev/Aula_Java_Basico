package com.example.encapsulamento;

public class Aluno {
    private String nome;
    private int email;

    public Aluno(String nome, int email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEmail() {
        return email;
    }
    public void setEmail(int email) {
        this.email = email;
    }
}
