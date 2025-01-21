package br.com.stpaes.domain;

/**
 * Representa um motorista de ônibus com nome, número da carteira de motorista,
 * e o status de direção.
 */
public class Motorista {

    private String nome;
    private String carteiraMotorista;
    private boolean estarDirigindo;


    /**
     * Construtor da classe Motorista.
     *
     * @param nome O nome do motorista.
     * @param carteiraMotorista O número da carteira de motorista do motorista (CNH).
     */
    public Motorista(String nome, String carteiraMotorista) {
        this.nome = nome;
        this.carteiraMotorista = carteiraMotorista;
        this.estarDirigindo = false; //falso porque inicia com o onibus parado.
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


   //Inicia a direção do motorista, alterando o status para "dirigindo".
    public void iniciarDirecao(){
        estarDirigindo = true;
        System.out.println("Iniciando direcao");
    }

    //Desliga a direção do motorista, alterando o status para "não dirigindo".
    public void desligarDirecao(){
        estarDirigindo = false;
        System.out.println("Desligando direcao");
    }


    //Exibe o status atual do motorista, incluindo seu nome, número da CNH e se está dirigindo ou não.
    //caberia um if else nesse de estar ligado ou não mas pretendo reaproveitar esse código em outro exercício.
    public void exibirStatus() {
        System.out.println("Motorista: " + nome);
        System.out.println("CNH: " + carteiraMotorista);
        System.out.println("Está dirigindo: " + (estarDirigindo ? "Sim" : "Não"));
    }
}
