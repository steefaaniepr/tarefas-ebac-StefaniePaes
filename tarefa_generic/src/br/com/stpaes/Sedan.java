package br.com.stpaes;

public class Sedan extends Carro {

    public Sedan(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Sedan - modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano);
    }


}
