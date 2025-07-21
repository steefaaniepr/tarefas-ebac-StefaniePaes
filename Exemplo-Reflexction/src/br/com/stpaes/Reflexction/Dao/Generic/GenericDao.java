package br.com.stpaes.Reflexction.Dao.Generic;

import br.com.stpaes.Reflexction.Domain.Persistente;
import br.com.stpaes.Reflexction.SingletonMap;

import java.util.Collection;
import java.util.Map;

public abstract class GenericDao<T extends Persistente> implements IGenericDao<T> {

    private SingletonMap singletonMap;
    public abstract Class<T> getTipoClasse();

    public abstract void atualizarDados(T entity, T entityCadastrado);

    public GenericDao() {
        this.singletonMap = SingletonMap.getInstance();
    }

    @Override
    public Boolean cadastrar(T entity) {
        //Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
        if (mapaInterno.containsKey(entity.getCodigo())) {
            return false;
        }
        mapaInterno.put(entity.getCodigo(), entity);
        return true;
    }

    @Override
    public void excluir(Long valor) {
        //Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(valor);
        if (objetoCadastrado != null) {
            mapaInterno.remove(valor, objetoCadastrado);
        }
    }

    @Override
    public void alterar(T entity) {
        //Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(entity.getCodigo());
        if (objetoCadastrado != null) {
            atualizarDados(entity, objetoCadastrado);
        }
    }

    @Override
    public T consultar(Long valor) {
        //Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
        return mapaInterno.get(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        //Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
        return mapaInterno.values();
    }
}
