package br.com.stpaes.Collecton.Array.ArrayList;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nome + " - " + cargo + " - Salário: " + salario;
    }
}
