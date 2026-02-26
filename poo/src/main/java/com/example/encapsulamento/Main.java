package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {
        // String nome;
        // int idade;

        // nome = "Marta";
        // idade = 22;

        //INSTANCIAR A CLASSE
        // Cliente cliente1 = new Cliente("Marta", 20);

        // System.out.println("Nome: " + cliente1.getNome());
        // System.out.println("Idade: " + cliente1.getIdade());

        //  PROGRAMAÇÃO ORIENTADA A OBJETOS
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

        // // Livro livro1 = new Livro();
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

    //     Funcionario funcionario1 = new Funcionario();
    //     funcionario1.setNome("Guilherme");
    //     funcionario1.setCargo("Desenvolvedor");
    //     funcionario1.setSalario(6000.00);

    //     System.out.println("Nome: " + funcionario1.getNome());
    //     System.out.println("Cargo: " + funcionario1.getCargo());
    //     System.out.println("Salário: " + funcionario1.getSalario());



    // Atividade 1
        // Livro2 livro01 = new Livro2("Iliada", "Homero", 12345678901500, 50);
        // Livro2 livro02 = new Livro2("Odisseia", "Homero", 123456789012,600, 60);

        // System.out.println("Livro 1:");
        // System.out.println("Título: " + livro01.getTitulo());
        // System.out.println("Autor: " + livro01.getAutor());
        // System.out.println("Código: " + livro01.getISBN());
        // System.out.println("Número de Páginas: " + livro01.getNumeroPaginas());
        // System.out.println("Preço: R$ " + livro01.getPreco());

        // System.out.println("\nLivro 2:");
        // System.out.println("Título: " + livro02.getTitulo());
        // System.out.println("Autor: " + livro02.getAutor());
        // System.out.println("Código: " + livro02.getISBN());
        // System.out.println("Número de Páginas: " + livro02.getNumeroPaginas());
        // System.out.println("Preço: R$ " + livro02.getPreco());


     // Atividade 2
    //     Veiculo veiculo1 = new Veiculo("ABC-1234", "Branca", 8, 50.00, 170, 10.00);
    //     Veiculo veiculo2 = new Veiculo("DEF-5678", "Preta", 4, 30.00, 150, 8.00);

    //     System.out.println("Veículo 1:");
    //     System.out.println("Placa: " + veiculo1.getPlaca());
    //     System.out.println("Cor: " + veiculo1.getCor());
    //     System.out.println("Número de Passageiros: " + veiculo1.getNumeroPassageiros());
    //     System.out.println("Capacidade do Tanque: " + veiculo1.getCapacidadeTanque() + "L");
    //     System.out.println("Velocidade Máxima: " + veiculo1.getVelocidadeMaxima() + "Km/h");
    //     System.out.println("Consumo Médio: " + veiculo1.getConsumoMedio() + "Km/L");

    //     System.out.println("\nVeículo 2:");
    //     System.out.println("Placa: " + veiculo2.getPlaca());
    //     System.out.println("Cor: " + veiculo2.getCor());
    //     System.out.println("Número de Passageiros: " + veiculo2.getNumeroPassageiros());
    //     System.out.println("Capacidade do Tanque: " + veiculo2.getCapacidadeTanque() + "L");
    //     System.out.println("Velocidade Máxima: " + veiculo2.getVelocidadeMaxima() + "Km/h");
    //     System.out.println("Consumo Médio: " + veiculo2.getConsumoMedio() + "Km/L");
    //  }    

        // Atividade 3
        Cliente cliente1 = new Cliente("Marta", 22, 123456789, "Rua A, 123", 987654321);
        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("CPF: " + cliente1.getCPF());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());
    }
}