package br.com.stpaes.Reflexction.Dao;

import br.com.stpaes.Reflexction.Dao.Generic.GenericDao;
import br.com.stpaes.Reflexction.Domain.Produto;
import br.com.stpaes.Reflexction.SingletonMap;

import java.util.HashMap;
import java.util.Map;

public class ProdutoDao extends GenericDao<Produto> implements IProdutoDao {

    public ProdutoDao() {
        super();
        Map<Long, Produto> mapaInterno =
                (Map<Long, Produto>) SingletonMap.getInstance().getMap().get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            SingletonMap.getInstance().getMap().put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto entity, Produto entityCadastrado) {
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setCodigo(entity.getCodigo());
    }

}
