package br.com.stpaes;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros {

    private List<Carro> carros;

    public ListaDeCarros() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void listarCarros() {
        for (Carro carro : carros) {
            carro.exibirDetalhes();
        }
    }

}
