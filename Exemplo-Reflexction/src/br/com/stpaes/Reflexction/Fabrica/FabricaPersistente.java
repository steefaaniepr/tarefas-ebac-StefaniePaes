package br.com.stpaes.Reflexction.Fabrica;

import br.com.stpaes.Reflexction.Domain.Persistente;

public interface FabricaPersistente {

    Persistente criarObjeto(String dados[]);
}
