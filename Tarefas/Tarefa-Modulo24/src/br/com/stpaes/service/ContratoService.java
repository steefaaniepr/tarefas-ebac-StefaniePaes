package br.com.stpaes.service;

import br.com.stpaes.dao.ContratoDao;
import br.com.stpaes.dao.ContratoDaoMock;
import br.com.stpaes.dao.IContratoDao;

public class ContratoService implements IContratoService {

    IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = new ContratoDao();
    }

    @Override
    public String salvar() {
        return "Sucesso";
    }
}
