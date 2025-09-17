package br.com.stpaes.dao.generic.jdbc.dao;

import br.com.stpaes.Domain.Produto;

import java.sql.SQLException;
import java.util.List;

public interface IProdutoDao {
    
    Integer cadastrar(Produto produto) throws Exception;
    Produto buscar(String number) throws Exception;
    Integer excluir(Produto produtoDB) throws Exception;
    List<Produto> buscarTodos() throws Exception;
    Integer atualizar(Produto produtoDB) throws Exception;
}
