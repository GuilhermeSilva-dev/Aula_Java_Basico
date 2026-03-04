package com.example.revisao;

public class Main {
    public static void main(String[] args) {
        // INSTANCIAR A CLASSE PROFESSOR
        Professor professor1 = new Professor( "Marta", "Lógica de programação");
        Professor professor2 = new Professor( "Joao", "Desenvolvimento de Sistemas");


        System.out.println("Nome: " + professor1.getNome());
        System.out.println("Disciplina: " + professor1.getDisciplina());
        System.out.println();
        System.out.println("Nome: " + professor2.getNome());
        System.out.println("Disciplina : " + professor2.getDisciplina());
    }
}
