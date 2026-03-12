package org.example.ex1;

public class Pato implements Animal{
    @Override
    public String emitirSom() {
        return "QUACK QUACK";
    }

    @Override
    public String comer() {
        return "Pão";
    }
}
