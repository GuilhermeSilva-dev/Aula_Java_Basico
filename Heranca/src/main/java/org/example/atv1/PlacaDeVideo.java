package org.example.atv1;

public class PlacaDeVideo extends Pc{
    private String memoria;

    public PlacaDeVideo(String marca, String modelo, String memoria) {
        super(marca, modelo);
        this.memoria = memoria;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "PlacaDeVideo{" +
                "memoria='" + memoria + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
