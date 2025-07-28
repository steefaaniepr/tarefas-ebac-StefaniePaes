package br.com.stpaes.PradroesProjetos.Facade;

import javax.swing.*;

public class ApartamentoService implements IApartamentoService {

    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isAPartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isCamposValidos(apartamento);
        if (isCadastrado && !isCamposValidos) {
            return false;
        }
        return cadastrarNoBanco(apartamento);

    }

    private Boolean cadastrarNoBanco(Apartamento apartamento) {
        return true;
    }


    private Boolean isAPartamentoCadastrado(Apartamento apartamento) {
        return false;
    }

    private Boolean isCamposValidos(Apartamento apartamento) {
        return true;
    }
}
