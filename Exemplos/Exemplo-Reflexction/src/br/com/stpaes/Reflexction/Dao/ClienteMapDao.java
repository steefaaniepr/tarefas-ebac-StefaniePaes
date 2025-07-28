package br.com.stpaes.Reflexction.Dao;

import br.com.stpaes.Reflexction.Dao.Generic.GenericDao;
import br.com.stpaes.Reflexction.Domain.Cliente;
import br.com.stpaes.Reflexction.SingletonMap;

import java.util.HashMap;
import java.util.Map;

public class ClienteMapDao extends GenericDao<Cliente> implements IClienteDao {

    public ClienteMapDao() {
        super();
        Map<Long, Cliente> mapaInterno =
                (Map<Long, Cliente>) SingletonMap.getInstance().getMap().get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            SingletonMap.getInstance().getMap().put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente cliente, Cliente entityCadastrado) {
        entityCadastrado.setNome(cliente.getNome());
        entityCadastrado.setTel(cliente.getTel());
        entityCadastrado.setNumero(cliente.getNumero());
        entityCadastrado.setEnd(cliente.getEnd());
        entityCadastrado.setCidade(cliente.getCidade());
        entityCadastrado.setEstado(cliente.getEstado());
    }


}
