package br.com.stpaes.Generics.Cadastro.Dao.Generics;

import br.com.stpaes.Generics.Cadastro.Domain.Persistente;
import br.com.stpaes.Generics.Cadastro.Domain.Produto;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {

    public Boolean cadastrar(T entity);

    public void excluir(Long valor);

    public void alterar(T entity);

    public T consultar(Long valor);

    public Collection<T> buscarTodos();

}
