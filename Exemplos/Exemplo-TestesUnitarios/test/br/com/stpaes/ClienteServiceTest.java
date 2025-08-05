package br.com.stpaes;

import br.com.stpaes.dao.ClienteDao;
import br.com.stpaes.dao.ClienteDaoMock;
import br.com.stpaes.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest(){
        ClienteDaoMock mock = new ClienteDaoMock();
        ClienteService service = new ClienteService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest(){
        ClienteDao dao = new ClienteDao();
        ClienteService service = new ClienteService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
