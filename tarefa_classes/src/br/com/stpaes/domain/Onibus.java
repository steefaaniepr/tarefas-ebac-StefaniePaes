package br.com.stpaes.domain;

public class Onibus {

    private int capacidade;
    private String rota;
    private int passageirosAtuais;

    public Onibus(int capacidade, String rota, int passageirosAtuais) {
        this.capacidade = capacidade;
        this.rota = rota;
        this.passageirosAtuais = passageirosAtuais;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
        System.out.println("Capacidade do ônibus definida para: " + capacidade + " passageiros.");
    }

    public int getPassageirosAtuais() {
        return passageirosAtuais;
    }

    public void setPassageirosAtuais(int passageirosAtuais) {
        this.passageirosAtuais = passageirosAtuais;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public boolean temEspaco() {
        return passageirosAtuais < capacidade;
    }

    public void embarcarPassageiro() {
        passageirosAtuais++;
        System.out.println("Um passageiro embarcou. Passageiros atuais: " + passageirosAtuais);
    }

    public void desembarcarPassageiro() {
        passageirosAtuais--;
        System.out.println("Um passageiro desembarcou. Passageiros atuais: " + passageirosAtuais);
    }

    public void exibirStatus() {
        System.out.println("Rota: " + rota);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Passageiros atuais: " + passageirosAtuais);
    }
}
