package br.com.stpaes;

import br.com.stpaes.Carros.Carro;
import br.com.stpaes.Cliente.Cliente;
import br.com.stpaes.Fabricas.Fabrica;

import static br.com.stpaes.Fabricas.Fabrica.escolherFabrica;

public class App {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("luxo",true);
        Fabrica fabrica = escolherFabrica(cliente);
        Carro carro = fabrica.criar(cliente.getTipoCarro());
        carro.ligarMotor();
    }

}
