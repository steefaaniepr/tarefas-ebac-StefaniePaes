package br.com.stpaes.Collecton.List.ArrayList;

public class Funcionario {
    String nome;
    String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return nome + " - " + cargo;
    }
}
