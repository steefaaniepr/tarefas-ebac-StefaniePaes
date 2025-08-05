package br.com.stpaes.dao;

import br.com.stpaes.domain.Cliente;

public class ClienteDaoMock implements IClienteDao{
    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluir(Long cpf) {

    }
}
