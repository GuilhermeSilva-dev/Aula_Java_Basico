package org.example.atv1;

public class PlacaMae extends Pc {
    private String chipset;

    public PlacaMae(String marca, String modelo, String chipset) {
        super(marca, modelo);
        this.chipset = chipset;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "PlacaMae{" +
                "chipset='" + chipset + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
