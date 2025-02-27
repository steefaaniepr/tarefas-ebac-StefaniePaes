
package javaapplication1.dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javaapplication1.domain.Cliente;


public class ClienteSetDAO {
    
    private Set<Cliente> set;

    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }

    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }

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

    public void alterar(Cliente cliente) {
        if (this.set.contains(cliente)) {
            for (Cliente clienteEncontrado : this.set) {
                if (clienteEncontrado.equals(cliente)) {
                    clienteEncontrado.setNome(cliente.getNome());
                    clienteEncontrado.setTel(cliente.getTel());
                    clienteEncontrado.setEnd(cliente.getEnd());
                    clienteEncontrado.setNumero(cliente.getNumero());
                    clienteEncontrado.setCidade(cliente.getCidade());
                    clienteEncontrado.setEstado(cliente.getEstado());
                    break;
                }
            }
        }
    }

    public Cliente consultar(Long cpf) {
        for (Cliente clienteEncontrado : this.set) {
            if (clienteEncontrado.getCpf().equals(cpf)) {
                return clienteEncontrado;
            }
        }
        return null;
    }

    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
}
