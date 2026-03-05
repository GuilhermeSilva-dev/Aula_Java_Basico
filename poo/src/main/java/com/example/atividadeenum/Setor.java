package com.example.atividadeenum;

public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recursos Humanos(RH)"),
    VENDAS("Vendas"),
    MARKETING("Marketing");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
