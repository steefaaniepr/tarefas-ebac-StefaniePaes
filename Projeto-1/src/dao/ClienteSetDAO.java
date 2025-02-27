/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cliente;
import java.util.Collection;
import java.util.Set;

/**
 *
 * @author Pichau
 */
public class ClienteSetDAO implements IClienteDAO{
    
    private Set<Cliente> set;
    
    @Override
    public Boolean cadastrar(Cliente cliente){
        return this.set.add(cliente);
    }
    
    @Override
    public void excluir(Long cpf) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : this.set) {
            if (cliente.getCpf().equals(cpf)){
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
                    clienteEncontrado.setEnd(cliente.getEnd());
                    clienteEncontrado.setNumero(cliente.getNumero());
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
            if (clienteEncontrado.getCpf().equals(cpf)){
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
