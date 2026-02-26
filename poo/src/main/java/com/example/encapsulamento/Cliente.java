package com.example.encapsulamento;

public class Cliente {
    // ATRIBUTOS DA CLASSE
    private String nome;
    private int idade;
    private int CPF;
    private String endereco;
    private int telefone;

    // CONSTRUTOR
    public Cliente(String nome, int idade, int CPF, String endereco, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //METODOS DE ACESSO.
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        CPF = cPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
