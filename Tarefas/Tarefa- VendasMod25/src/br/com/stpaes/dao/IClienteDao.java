package br.com.stpaes.dao;

import br.com.stpaes.domain.Cliente;

public interface IClienteDao {

    Boolean salvar(Cliente cliente);
    Cliente buscarPorCpf(Long cpf);

    void excluir(Long cpf);
}
