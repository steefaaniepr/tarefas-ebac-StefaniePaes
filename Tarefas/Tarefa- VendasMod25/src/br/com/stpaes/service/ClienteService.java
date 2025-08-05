package br.com.stpaes.service;

import br.com.stpaes.dao.ClienteDao;
import br.com.stpaes.dao.IClienteDao;
import br.com.stpaes.domain.Cliente;

public class ClienteService implements IClienteService{

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
        this.clienteDao = clienteDao;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return clienteDao.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return clienteDao.buscarPorCpf(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDao.excluir(cpf);
    }
}
