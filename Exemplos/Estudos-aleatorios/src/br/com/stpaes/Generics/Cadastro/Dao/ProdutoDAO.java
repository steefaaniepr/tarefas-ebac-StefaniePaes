package br.com.stpaes.Generics.Cadastro.Dao;

import br.com.stpaes.Generics.Cadastro.Dao.Generics.GenericDAO;
import br.com.stpaes.Generics.Cadastro.Domain.Cliente;
import br.com.stpaes.Generics.Cadastro.Domain.Persistente;
import br.com.stpaes.Generics.Cadastro.Domain.Produto;

import java.util.Collection;
import java.util.List;

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO {

    public ProdutoDAO() {
        super();
    }

    @Override
    public Class getTipoClasse() {
        return null;
    }

    @Override
    public void atualizarDados(Produto entity, Produto entidadeCadastrada) {

    }


//    @Override
//    public Boolean cadastrar(Produto produto) {
//        return null;
//    }
//
//    @Override
//    public void excluir(Long codigo) {
//
//    }
//
//    @Override
//    public void alterar(Produto produto) {
//
//    }
//
//    @Override
//    public Produto consultar(Long cpf) {
//        return null;
//    }
//
//    @Override
//    public Collection<Produto> buscarTodos() {
//        return List.of();
//    }

}
