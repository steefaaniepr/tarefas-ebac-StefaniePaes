package br.com.stpaes.dao;

import br.com.stpaes.domain.Cliente;

public interface IClienteDao {

    void salvar(Cliente cliente);
    Cliente buscarPorCpf(Long cpf);
}
