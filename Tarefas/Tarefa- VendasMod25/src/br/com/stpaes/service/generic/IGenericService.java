package br.com.stpaes.service.generic;


import br.com.stpaes.domain.Persistente;
import br.com.stpaes.exception.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;


public interface IGenericService <T extends Persistente, E extends Serializable> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(Long valor);

    public void alterar (T entity) throws TipoChaveNaoEncontradaException;

    public T consultar (Long valor);

    public Collection<T> buscarTodos();
}
