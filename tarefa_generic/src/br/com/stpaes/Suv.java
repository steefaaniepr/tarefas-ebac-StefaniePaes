package br.com.stpaes;

public class Suv extends Carro {

    public Suv(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void exibirDetalhes() {
        System.out.println("Suv - modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano);
    }
}
