package br.com.stpaes.domain;

public class Motorista {

    private String nome;
    private String carteiraMotorista;
    private boolean estarDirigindo;

    public Motorista(String nome, String carteiraMotorista) {
        this.nome = nome;
        this.carteiraMotorista = carteiraMotorista;
        this.estarDirigindo = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarteiraMotorista() {
        return carteiraMotorista;
    }

    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }

    public void iniciarDirecao(){
        estarDirigindo = true;
        System.out.println("Iniciando direcao");
    }

    public void desligarDirecao(){
        estarDirigindo = false;
        System.out.println("Desligando direcao");
    }

    public void exibirStatus() {
        System.out.println("Motorista: " + nome);
        System.out.println("CNH: " + carteiraMotorista);
        System.out.println("Está dirigindo: " + (estarDirigindo ? "Sim" : "Não"));
    }
}
