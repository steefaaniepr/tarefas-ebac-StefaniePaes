package br.com.stpaes.domain;

/**
 * Representa um ônibus com capacidade, rota e passageiros.
 * Contém métodos para embarcar, desembarcar passageiros e exibir status do ônibus.
 */

public class Onibus {

    private int capacidade;
    private String rota;
    private int passageirosAtuais;


    /**
     * Construtor da classe Onibus.
     *
     * @param capacidade Capacidade máxima de passageiros do ônibus.
     * @param rota A rota que o ônibus está seguindo.
     * @param passageirosAtuais Quantidade inicial de passageiros no ônibus.
     */
    public Onibus(int capacidade, String rota, int passageirosAtuais) {
        this.capacidade = capacidade;
        this.rota = rota;
        this.passageirosAtuais = passageirosAtuais;
    }

    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Define a capacidade máxima de passageiros do ônibus.
     *
     * @param capacidade Nova capacidade do ônibus.
     */
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

    //Embarca um passageiro no ônibus, aumentando o número de passageiros.
    public void embarcarPassageiro() {
        passageirosAtuais++;
        System.out.println("Um passageiro embarcou. Passageiros atuais: " + passageirosAtuais);
    }

    //Desembarca um passageiro do ônibus, diminuindo o número de passageiros.
    public void desembarcarPassageiro() {
        passageirosAtuais--;
        System.out.println("Um passageiro desembarcou. Passageiros atuais: " + passageirosAtuais);
    }

    //Exibe o status atual do ônibus, incluindo a rota, capacidade e número de passageiros.
    public void exibirStatus() {
        System.out.println("Rota: " + rota);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Passageiros atuais: " + passageirosAtuais);
    }
}
