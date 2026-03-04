package com.example.atividade3;

public class Funcionario {
    private int codigofuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBancaria contabanco;


    public Funcionario(int codigofuncionario, String nome, String endereco, String telefone, String email, ContaBancaria contabanco) {
        this.codigofuncionario = codigofuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contabanco = contabanco;
    }

    public int getCodigofuncionario() {
        return codigofuncionario;
    }

    public void setCodigofuncionario(int codigofuncionario) {
        this.codigofuncionario = codigofuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContabanco() {
        return contabanco;
    }

    public void setContabanco(ContaBancaria contabanco) {
        this.contabanco = contabanco;
    }
}
