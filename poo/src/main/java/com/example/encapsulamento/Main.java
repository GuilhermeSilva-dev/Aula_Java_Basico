package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {
        // String nome;
        // int idade;

        // nome = "Marta";
        // idade = 22;

         //PROGRAMAÇÃO ORIENTADA A OBJETOS
        // Cliente cliente1 = new Cliente();
        // cliente1.nome = "Marta";
        // cliente1.idade = 22;

        // Pet pet1 = new Pet();
        // pet1.nome = "Tobby"; 
        // pet1.idade = 1;

        // ENCAPSULAMENTO
        // Cliente cliente1 = new Cliente();
        // cliente1.setNome("Marta");
        // cliente1.setIdade(22);

        // Pet pet1 = new Pet();
        // pet1.setNome("Tobby");
        // pet1.setIdade(1);

        // System.out.println("Nome: " + cliente1.getNome());
        // System.out.println("Idade: " + cliente1.getIdade());



        // System.out.println("Nome : " + pet1.getNome());
        // System.out.println("Idade : " + pet1.getIdade());

        // Livro livro1 = new Livro();
        // livro1.setNome("Iliada");
        // livro1.setAutor("Homero");
        // livro1.setCodigo(001);
        // livro1.setValor(50.00);

        // Livro livro2 = new Livro();
        // livro2.setNome("Odisseia");
        // livro2.setAutor("Homero");
        // livro2.setCodigo(002);
        // livro2.setValor(60.00);


        // System.out.println("Livro: " + livro1.getNome());
        // System.out.println("Autor: " + livro1.getAutor());
        // System.out.println("Código: " + livro1.getCodigo());
        // System.out.println("Preço: R$ " + livro1.getValor());


        // System.out.println("Livro: " + livro2.getNome());
        // System.out.println("Autor: " + livro2.getAutor());
        // System.out.println("Código: " + livro2.getCodigo());
        // System.out.println("Preço: R$ " + livro2.getValor());

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Guilherme");
        funcionario1.setCargo("Desenvolvedor");
        funcionario1.setSalario(6000.00);

        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: " + funcionario1.getSalario());

    }
}
