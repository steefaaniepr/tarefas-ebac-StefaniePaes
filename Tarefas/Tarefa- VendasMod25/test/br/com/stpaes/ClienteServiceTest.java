package br.com.stpaes;

import br.com.stpaes.dao.ClienteDaoMock;
import br.com.stpaes.dao.IClienteDao;
import br.com.stpaes.domain.Cliente;
import br.com.stpaes.exception.TipoChaveNaoEncontradaException;
import br.com.stpaes.service.ClienteService;
import br.com.stpaes.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDao dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setNome("Rodrigo");
        cliente.setCpf(12312312312L);
        cliente.setTel(11999999999L);
        cliente.setEnd("Rua A");
        cliente.setNumero(1);
        cliente.setCidade("São Paulo");
        cliente.setEstado("SP");
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteService.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Stefanie");
        clienteService.alterar(cliente);
        Assert.assertEquals("Stefanie", cliente.getNome());
    }
}
