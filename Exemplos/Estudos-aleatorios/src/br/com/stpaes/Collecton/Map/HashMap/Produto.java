package br.com.stpaes.Collecton.Map.HashMap;

public class Produto {
    int id;
    String nome;
    double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " - R$ " + preco;
    }
}
