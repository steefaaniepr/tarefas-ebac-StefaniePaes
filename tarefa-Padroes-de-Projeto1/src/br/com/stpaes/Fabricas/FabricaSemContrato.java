package br.com.stpaes.Fabricas;

import br.com.stpaes.Carros.Carro;
import br.com.stpaes.Carros.CarroEconomico;

public class FabricaSemContrato implements Fabrica{
    @Override
    public Carro criar(String tipo) {
        return new CarroEconomico();
    }
}
