package br.com.stpaes.domain;

public class Produto {

    private Long id;
    private String nome;
    private String marca;
    private double valorEstoque;
    private double preco;

    public Produto(Long id, String nome, String marca, double valorEstoque, double preco) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.valorEstoque = valorEstoque;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorEstoque() {
        return valorEstoque;
    }

    public void setValorEstoque(double valorEstoque) {
        this.valorEstoque = valorEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
