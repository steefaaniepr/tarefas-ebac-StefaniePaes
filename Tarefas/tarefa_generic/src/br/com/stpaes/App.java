package br.com.stpaes;

public class App {

    public static void main(String[] args) {

        ListaDeCarros lista = new ListaDeCarros();

        lista.adicionarCarro(new Sedan("Civic", "Honda", 2022));
        lista.adicionarCarro(new Suv("Compass", "Jeep", 2023));
        lista.adicionarCarro(new Esportivo("911", "Porsche", 2021));

        lista.listarCarros();
    }
}
