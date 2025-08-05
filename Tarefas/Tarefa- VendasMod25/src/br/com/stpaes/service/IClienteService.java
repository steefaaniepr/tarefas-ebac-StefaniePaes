package br.com.stpaes.service;

import br.com.stpaes.domain.Cliente;

public interface IClienteService {

    void salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);
}
