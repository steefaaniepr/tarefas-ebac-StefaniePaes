package br.com.stpaes;

import br.com.stpaes.dao.ClienteDao;
import br.com.stpaes.dao.ClienteDaoMock;
import br.com.stpaes.dao.IClienteDao;
import br.com.stpaes.domain.Cliente;
import br.com.stpaes.service.ClienteService;
import br.com.stpaes.service.IClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    private IClienteService clienteService;

    public ClienteTest() {
        IClienteDao dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Test
    public void pesquisarClienteTest(){
        Cliente cliente = new Cliente();
        cliente.setNome("Rodrigo");
        cliente.setCpf(12312312312L);
        cliente.setTel(11999999999L);
        cliente.setEnd("Rua A");
        cliente.setNumero(1);
        cliente.setCidade("São Paulo");
        cliente.setEstado("SP");

        clienteService.salvar(cliente);
        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
}
