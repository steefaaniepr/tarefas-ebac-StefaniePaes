package br.com.stpaes.Generics.Cadastro.Dao;

import br.com.stpaes.Generics.Cadastro.Dao.Generics.GenericDAO;
import br.com.stpaes.Generics.Cadastro.Domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO{

    public ClienteMapDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente cliente, Cliente entidadeCadastrada) {
        entidadeCadastrada.setNome(cliente.getNome());
        entidadeCadastrada.setTel(cliente.getTel());
        entidadeCadastrada.setEnd(cliente.getEnd());
        entidadeCadastrada.setNumero(cliente.getNumero());
        entidadeCadastrada.setCidade(cliente.getCidade());
        entidadeCadastrada.setEstado(cliente.getEstado());

    }


//    private Map<Long, Cliente> map;
//
//    public ClienteMapDAO() {
//        this.map = new HashMap<>();
//    }
//
//    @Override
//    public Boolean cadastrar(Cliente cliente) {
//        if(this.map.containsKey(cliente.getCpf())) {
//            return false;
//        }
//        this.map.put(cliente.getCpf(), cliente);
//        return true;
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//        Cliente clienteCadastrado = this.map.get(cpf);
//
//        if(clienteCadastrado != null) {
//            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
//        }
//    }
//
//    @Override
//    public void alterar(Cliente cliente) {
//        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
//
//        if (clienteCadastrado != null) {
//            clienteCadastrado.setNome(cliente.getNome());
//            clienteCadastrado.setTel(cliente.getTel());
//            clienteCadastrado.setEnd(cliente.getEnd());
//            clienteCadastrado.setNumero(cliente.getNumero());
//            clienteCadastrado.setCidade(cliente.getCidade());
//            clienteCadastrado.setEstado(cliente.getEstado());
//        }
//    }
//
//    @Override
//    public Cliente consultar(Long cpf) {
//        return this.map.get(cpf);
//    }
//
//    @Override
//    public Collection<Cliente> buscarTodos() {
//        return this.map.values();
//    }

}
