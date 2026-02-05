package org.example.Atividade1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String name = scanner.nextLine();

        int fruta = 100;
        double prestacoes = fruta / 5;

        System.out.println("--LOJA MAMÃO COM AÇÚCAR--");
        System.out.println("Produtos: manga, uva, banana. ");

        System.out.println("Senhor(a) " + name);
        System.out.println("O valor da sua compra foi: " + fruta);
        System.out.println("Dividido em 5 vezes ficou: " + prestacoes);


    }
}

