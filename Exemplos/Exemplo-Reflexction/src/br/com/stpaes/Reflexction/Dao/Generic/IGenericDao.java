package br.com.stpaes.Reflexction.Dao.Generic;

import br.com.stpaes.Reflexction.Domain.Persistente;

import java.util.Collection;

public interface IGenericDao <T extends Persistente> {

    public Boolean cadastrar(T entity);
    public void excluir(Long valor);
    public void alterar(T entity);
    public T consultar(Long valor);
    public Collection<T> buscarTodos();
}
