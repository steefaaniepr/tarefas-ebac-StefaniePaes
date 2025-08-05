package br.com.stpaes.dao;

import br.com.stpaes.domain.Cliente;

public class ClienteDaoMock implements IClienteDao{
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }
}
