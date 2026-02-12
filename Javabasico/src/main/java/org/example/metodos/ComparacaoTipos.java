package org.example.metodos;

public class ComparacaoTipos {
    public static void main(String[] args) {
        // Declaração de variáveis
        String nomeUsuario = "Marta";
        int senha = 123;

        // comparação de Strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);

        //Exibindo resultados
        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
