package br.com.stpaes;

public class Esportivo extends Carro {

    public Esportivo(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Esportivo - modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano);
    }


}
