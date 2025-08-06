package br.com.stpaes.service;

import br.com.stpaes.domain.Cliente;
import br.com.stpaes.exception.TipoChaveNaoEncontradaException;

public interface IClienteService {

    Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;;

    Cliente consultar(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
