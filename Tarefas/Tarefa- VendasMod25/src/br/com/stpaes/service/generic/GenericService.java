package br.com.stpaes.service.generic;

import br.com.stpaes.dao.generic.IGenericDao;
import br.com.stpaes.domain.Persistente;
import br.com.stpaes.exception.TipoChaveNaoEncontradaException;
import java.io.Serializable;
import java.util.Collection;

public class GenericService <T extends Persistente, E extends Serializable> implements IGenericService<T,E>{

    protected IGenericDao<T> dao;

    public GenericService(IGenericDao genericDao){
        this.dao = genericDao;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
        if (entity == null) {
            throw new IllegalArgumentException("Entidade nula!");
        }
        return dao.cadastrar(entity);
    }

    @Override
    public void excluir(Long valor) {
        if (valor == null) {
            throw new IllegalArgumentException("O valor está nulo!");
        }
         dao.excluir((Long) valor);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException {
        if (entity == null) {
            throw new IllegalArgumentException("Entidade nula!");
        }
        dao.alterar(entity);
    }

    @Override
    public T consultar(Long valor) {
        if (valor == null) {
            throw new IllegalArgumentException("O valor está nulo!");
        }
        return dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        return dao.buscarTodos();
    }
}
