package org.example.atv1;

public class Main {
    public static void main(String[] args) {
        PlacaMae placaM1 = new PlacaMae("AsRock", "B450M","B450");
        Processador proc1 = new Processador("AMD",
                "Ryzen 5 4600G","3.7Ghz");
        MemoriaRam mem1 = new MemoriaRam("RiseMode",
                "Mode Z", "8+8(16Gb)");
        PlacaDeVideo placavid1 = new PlacaDeVideo("AsRock","7600 Pro Oc","8Gb");
        Armazenamento armazen1 = new Armazenamento("Kabum","SSD","1Tb","Usb");
        System.out.println(placaM1.toString());
        System.out.println(proc1.toString());
        System.out.println(mem1.toString());
        System.out.println(placavid1.toString());
        System.out.println(armazen1.toString());
    }
}
