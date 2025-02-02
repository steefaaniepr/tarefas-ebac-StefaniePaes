package br.com.stpaes.Collecton.List.LinkedList;

public class Cliente {
    String nome;
    int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos";
    }
}
