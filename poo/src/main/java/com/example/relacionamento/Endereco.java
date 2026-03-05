package com.example.relacionamento;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private UnidadeFederativa uf;

    private String texto;

    public Endereco(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public Endereco(String logradouro, String numero, String complemento,
                    String cep, String cidade, UnidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf=" + uf +
                '}';
    }
}
