package br.com.stpaes.service;

import br.com.stpaes.dao.ContratoDao;
import br.com.stpaes.dao.ContratoDaoMock;
import br.com.stpaes.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Conferindo no banco de dados";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Excluido com sucesso";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizado com sucesso";
    }
}
