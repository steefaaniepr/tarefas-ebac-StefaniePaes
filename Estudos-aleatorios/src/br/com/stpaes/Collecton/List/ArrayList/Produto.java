package br.com.stpaes.Collecton.List.ArrayList;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " +  preco;
    }
}

// ArrayList é mais eficiente quando a principal operação é buscar e listar itens.