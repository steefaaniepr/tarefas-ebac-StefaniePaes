package br.com.stpaes.Fabricas;

import br.com.stpaes.Carros.Carro;
import br.com.stpaes.Carros.CarroEconomico;
import br.com.stpaes.Carros.CarroLuxo;

public class FabricaComContrato implements Fabrica{

    @Override
    public Carro criar(String tipo) {

        if ("luxo".equalsIgnoreCase(tipo)) {
            return new CarroLuxo();
        } else {
            return new CarroEconomico();
        }
    }
}
