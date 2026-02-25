package com.example.encapsulamento;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
