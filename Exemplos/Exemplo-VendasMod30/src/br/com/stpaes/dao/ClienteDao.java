package br.com.stpaes.dao;

import br.com.stpaes.dao.generic.GenericDao;
import br.com.stpaes.domain.Cliente;

public class ClienteDao extends GenericDao<Cliente, Long> implements IClienteDao {

    public ClienteDao(){
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCidade(entity.getCidade());
    }


}
