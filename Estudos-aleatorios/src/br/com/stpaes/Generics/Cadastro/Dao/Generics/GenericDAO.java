package br.com.stpaes.Generics.Cadastro.Dao.Generics;

import br.com.stpaes.Generics.Cadastro.Domain.Persistente;
import br.com.stpaes.Generics.Cadastro.Domain.Produto;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {

    protected Map<Class, Map<Long, T>> map;

    public abstract Class<T> getTipoClasse();


    public GenericDAO() {
        this.map = new HashMap<>();
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno.containsKey(entity.getCodigo())) {
            return false;
        }
        mapaInterno.put(entity.getCodigo(), entity);
        return true;
    }

    @Override
    public void excluir(Long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno != null) {
            T entidadeCadastrada = mapaInterno.get(valor);
            mapaInterno.remove(valor);
        }
    }

    @Override
    public void alterar(T entity) {

    }

    @Override
    public T consultar(Long valor) {
        return null;
    }

    @Override
    public Collection<T> buscarTodos() {
        return List.of();
    }

}
