package com.example.encapsulamento;

public class Livro2 {
    private String Titulo;
    private String Autor;
    private int ISBN;
    private int NumeroPaginas;
    private int preco;

    public Livro2(String Titulo, String Autor,int ISBN, int NumeroPaginas, int preco) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.NumeroPaginas = NumeroPaginas;
        this.preco = preco;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        NumeroPaginas = numeroPaginas;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }


}
