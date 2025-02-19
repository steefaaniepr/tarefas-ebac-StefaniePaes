package br.com.stpaes.dao;

import br.com.stpaes.domain.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClienteSetDAO implements IClienteDAO{

    private Set<Cliente> set;

    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : this.set) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            this.set.remove(clienteEncontrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        if (this.set.contains(cliente)) {
            for (Cliente clienteEncontrado : this.set) {
                if (clienteEncontrado.equals(cliente)) {
                    clienteEncontrado.setNome(cliente.getNome());
                    clienteEncontrado.setTel(cliente.getTel());
                    clienteEncontrado.setNumero(cliente.getNumero());
                    clienteEncontrado.setEnd(cliente.getEnd());
                    clienteEncontrado.setCidade(cliente.getCidade());
                    clienteEncontrado.setEstado(cliente.getEstado());
                    break;
                }
            }
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        for (Cliente clienteEncontrado : this.set) {
            if (clienteEncontrado.getCpf().equals(cpf)) {
                return clienteEncontrado;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
}
