package br.com.stpaes.dao;

import br.com.stpaes.domain.Cliente;

public class ClienteDao implements IClienteDao{

    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }
}
