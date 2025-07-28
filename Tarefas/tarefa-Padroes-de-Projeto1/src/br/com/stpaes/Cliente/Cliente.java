package br.com.stpaes.Cliente;

public class Cliente {

    private String tipoCarro;
    private boolean contrato;

    public Cliente(String tipoCarro, boolean contrato) {
        this.tipoCarro = tipoCarro;
        this.contrato = contrato;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public boolean isContrato() {
        return contrato;
    }
}
