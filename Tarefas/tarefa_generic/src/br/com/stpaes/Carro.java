package br.com.stpaes;

public abstract class Carro {

    protected String marca;
    protected String modelo;
    protected int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void exibirDetalhes();
}
