package br.com.stpaes.Reflexction.Fabrica;

import br.com.stpaes.Reflexction.Domain.Cliente;
import br.com.stpaes.Reflexction.Domain.Persistente;

public class ClienteFabrica implements FabricaPersistente{


    @Override
    public Persistente criarObjeto(String dadosSeparados[]) {
        return new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
    }
}
