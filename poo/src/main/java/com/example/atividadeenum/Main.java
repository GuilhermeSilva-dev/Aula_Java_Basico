package com.example.atividadeenum;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario(01,"Guilherme",
                12714, Setor.FINANCEIRO,Sexo.MASCULINO, "22");
        Funcionario funcionario02 = new Funcionario(02, "Andressa",8247,
                        Setor.MARKETING, Sexo.FEMININO,"20");
        Funcionario funcionario03 = new Funcionario(03, "Gabriel",5873,
                        Setor.VENDAS, Sexo.MASCULINO,"34");
        Funcionario funcionario04 = new Funcionario(04, "Thalita",3980,
                        Setor.RECURSOS_HUMANOS, Sexo.FEMININO,"17");

        System.out.println(funcionario01.toString());
        System.out.println(funcionario02.toString());
        System.out.println(funcionario03.toString());
        System.out.println(funcionario04.toString());
    }
}
