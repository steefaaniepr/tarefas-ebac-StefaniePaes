package br.com.stpaes.Reflexction.Fabrica;

import br.com.stpaes.Reflexction.Domain.Persistente;
import br.com.stpaes.Reflexction.Domain.Produto;

public class ProdutoFabrica implements FabricaPersistente {

    @Override
    public Persistente criarObjeto(String[] dados) {
        Produto produto = new Produto();
        produto.setCodigo(Long.parseLong(dados[0].trim()));
        produto.setNome(dados[1]);
        return produto;
    }
}
