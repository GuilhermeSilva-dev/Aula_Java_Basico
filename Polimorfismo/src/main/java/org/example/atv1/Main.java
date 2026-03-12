package org.example.atv1;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println("Soma: " + soma.calcular(2,3));
        System.out.println("Subtração: " + subtracao.calcular(10,15));
        System.out.println("Divisão: " + divisao.calcular(20, 90));
        System.out.println("Multiplicação: " + multiplicacao.calcular(16,20));
    }
}
