package io.github.marciofao.hellospring.model;

public class Produto {

    // Atributos (declarados para que os getters, setters e construtor funcionem)
    private int id;
    private String nome;
    private double preco;

    // Construtor sem argumentos (corrigido: sem o tipo de retorno)
    public Produto() {
    }

    // Construtor com parâmetros
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}