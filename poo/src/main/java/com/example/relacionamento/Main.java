package com.example.relacionamento;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa(1,"Guilherme",20,"71988215919",
                "guilhermesilvadesouza@gmail.com", Sexo.MASCULINO,
                new Endereco("Rua A", "30", "Frente", "41204115",
                        "Salvador", UnidadeFederativa.BAHIA));

        System.out.println(pessoa01.toString());
    }
}
