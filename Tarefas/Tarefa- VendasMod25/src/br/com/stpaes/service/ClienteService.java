package br.com.stpaes.service;

import br.com.stpaes.dao.IClienteDao;
import br.com.stpaes.domain.Cliente;
import br.com.stpaes.exception.TipoChaveNaoEncontradaException;

public class ClienteService implements IClienteService{

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
        this.clienteDao = clienteDao;
    }

    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return clienteDao.cadastrar(cliente);
    }

    @Override
    public Cliente consultar(Long cpf) {
        return clienteDao.consultar(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDao.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        clienteDao.alterar(cliente);
    }
}
