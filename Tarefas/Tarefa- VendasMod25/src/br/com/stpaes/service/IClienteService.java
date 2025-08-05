package br.com.stpaes.service;

import br.com.stpaes.domain.Cliente;

public interface IClienteService {

    Boolean salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);

    void excluir(Long cpf);
}
