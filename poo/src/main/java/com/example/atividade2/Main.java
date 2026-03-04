package com.example.atividade2;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Romeu", "2", "Pitbull");
        Cliente cliente1 = new Cliente("Guilherme", "20",pet1);

        Cliente cliente2 = new Cliente("Maria", "33",
                new Pet("Julieta", "2", "Rottweiler"));

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade:" + cliente1.getIdade());
        System.out.println("PetNome: " + cliente1.getPet().getNome());
        System.out.println("PetIdade: " + cliente1.getPet().getIdade());
        System.out.println("PetRaça: " + cliente1.getPet().getRaca());
        System.out.println("Nome2: " + cliente2.getNome());
        System.out.println("Idade2: " + cliente2.getIdade());
        System.out.println("PetNome2: " + cliente2.getPet().getNome());
        System.out.println("PetIdade2: " + cliente2.getPet().getIdade());
        System.out.println("PetRaca2: " + cliente2.getPet().getRaca());
    }
}
