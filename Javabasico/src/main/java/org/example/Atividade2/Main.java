package org.example.Atividade2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String name = scanner.nextLine();

        System.out.println("--Mural de notas--");
        System.out.println("Insira a nota da primeira prova: ");
        double prova1 = scanner.nextDouble();
        System.out.println("Insira a nota da segunda prova: ");
        double prova2 = scanner.nextDouble();

        double media = (prova1 + prova2) / 2;
        double recuperacao = 6.9;

        if (media > recuperacao) {
            System.out.println("Aluno: " + name);
            System.out.println("Voçê passou com: " + media);
        } else {
            System.out.println("Aluno:  " + name);
            System.out.println("Voce perdeu com: " + media);
        }
    }
}
