package br.com.stpaes.domain;

public class Pessoa {

    String nome;
    String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
    }
}
