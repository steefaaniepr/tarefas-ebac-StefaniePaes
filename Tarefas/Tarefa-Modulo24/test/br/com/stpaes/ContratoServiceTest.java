package br.com.stpaes;

import br.com.stpaes.dao.ContratoDaoMock;
import br.com.stpaes.dao.IContratoDao;
import br.com.stpaes.service.ContratoService;
import br.com.stpaes.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
