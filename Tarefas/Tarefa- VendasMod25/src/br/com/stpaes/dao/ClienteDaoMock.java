package br.com.stpaes.dao;

import br.com.stpaes.domain.Cliente;
import br.com.stpaes.exception.TipoChaveNaoEncontradaException;

import java.util.Collection;
import java.util.List;

public class ClienteDaoMock implements IClienteDao{

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return List.of();
    }

}
