package org.example.exemplo1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marta",42,"03/11/2025",
                "Cartão de Crédito");
        Funcionario funcionario1 = new Funcionario("Guilherme",20,007,
                "Desenvolvedor","8759");

        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());

    }
}