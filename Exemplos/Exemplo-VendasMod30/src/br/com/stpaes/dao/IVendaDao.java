package br.com.stpaes.dao;

import br.com.stpaes.dao.generic.IGenericDao;
import br.com.stpaes.domain.Venda;
import br.com.stpaes.exceptions.DaoException;
import br.com.stpaes.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDao extends IGenericDao<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DaoException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DaoException;
}
