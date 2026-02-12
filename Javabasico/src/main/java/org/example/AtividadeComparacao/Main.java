package org.example.AtividadeComparacao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        // comparação de Strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Guilherme");
        boolean resultadoSenha = (senha == "123");




        if (resultadoNome && resultadoSenha == true) {
            System.out.println("Bem-vindo, usuário logado!");
        } else {
            System.out.println("Nome de usuário ou senha inválidos");
        }

    }
}
