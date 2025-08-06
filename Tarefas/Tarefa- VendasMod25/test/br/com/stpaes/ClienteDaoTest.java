package br.com.stpaes;

import br.com.stpaes.dao.ClienteDaoMock;
import br.com.stpaes.dao.IClienteDao;
import br.com.stpaes.domain.Cliente;
import br.com.stpaes.exception.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTest {

    private IClienteDao clienteDao;
    private Cliente cliente;

    public ClienteDaoTest() {
        clienteDao = new ClienteDaoMock();
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
    public void salvarClienteTest() throws TipoChaveNaoEncontradaException {
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarClienteTest(){
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void excluirCliente(){
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Stefanie");
        clienteDao.alterar(cliente);
        Assert.assertEquals("Stefanie", cliente.getNome());
    }
}
