package br.com.stpaes.Fabricas;

import br.com.stpaes.Carros.Carro;
import br.com.stpaes.Cliente.Cliente;

public interface Fabrica {

    Carro criar(String tipo);

    static Fabrica escolherFabrica(Cliente cliente) {

        if (cliente.isContrato()) {
            return new FabricaComContrato();
        } else {
            return new FabricaSemContrato();
        }
    }
}
