package com.example.atividade3;

public class ContaBancaria {
    private String banco;
    private String agencia;
    private String numeroconta;
    private String tipoconta;
    private double saldoatual;
    private double limitedisponivel;

    public ContaBancaria(String banco, String agencia, String numeroconta, String tipoconta, double saldoatual, double limitedisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroconta = numeroconta;
        this.tipoconta = tipoconta;
        this.saldoatual = saldoatual;
        this.limitedisponivel = limitedisponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    public double getSaldoatual() {
        return saldoatual;
    }

    public void setSaldoatual(double saldoatual) {
        this.saldoatual = saldoatual;
    }

    public double getLimitedisponivel() {
        return limitedisponivel;
    }

    public void setLimitedisponivel(double limitedisponivel) {
        this.limitedisponivel = limitedisponivel;
    }
}
