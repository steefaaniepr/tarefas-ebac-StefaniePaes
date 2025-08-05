package br.com.stpaes;

import br.com.stpaes.dao.ContratoDao;
import br.com.stpaes.dao.ContratoDaoMock;
import br.com.stpaes.dao.IContratoDao;
import br.com.stpaes.service.ContratoService;
import br.com.stpaes.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest(){
        IContratoDao mock = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest(){
        IContratoDao mock = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock);
        String busca = service.buscar();
        Assert.assertEquals("Conferindo no banco de dados", busca);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String busca = service.buscar();
        Assert.assertEquals("Conferindo no banco de dados", busca);
    }

    public void excluirTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String excluido = service.excluir();
        Assert.assertEquals("Excluido com sucesso", excluido);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String excluido = service.excluir();
        Assert.assertEquals("Conferindo no banco de dados", excluido);
    }

    public void atualizarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String atualizado = service.atualizar();
        Assert.assertEquals("Excluido com sucesso", atualizado);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String atualizado = service.excluir();
        Assert.assertEquals("Conferindo no banco de dados", atualizado);
    }


}
