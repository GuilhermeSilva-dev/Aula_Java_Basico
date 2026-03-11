package org.example.atv1;

public class Armazenamento extends Pc{
    private String capacidade;
    private String conexão;

    public Armazenamento(String marca, String modelo, String capacidade, String conexão) {
        super(marca, modelo);
        this.capacidade = capacidade;
        this.conexão = conexão;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getConexão() {
        return conexão;
    }

    public void setConexão(String conexão) {
        this.conexão = conexão;
    }

    @Override
    public String toString() {
        return "Armazenamento{" +
                "capacidade='" + capacidade + '\'' +
                ", conexão='" + conexão + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
