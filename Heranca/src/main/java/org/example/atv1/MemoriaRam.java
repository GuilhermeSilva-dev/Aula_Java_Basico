package org.example.atv1;

public class MemoriaRam extends  Pc {
    private String armazenamento;

    public MemoriaRam(String marca, String modelo, String armazenamento) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "armazenamento='" + armazenamento + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
