package com.example.encapsulamento;

public class Livro {
    // ATRIBUTOS DA CLASSE
    private String nome;
    private String autor;
    private double codigo;
    private double valor;   

    //METODOS DE ACESSO
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getCodigo() {
        return codigo;
    }
    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

}
