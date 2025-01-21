package br.com.stpaes.domain;

/**
 * Representa um passageiro, com informações sobre seu nome, idade e destino.
 * Contém métodos para alterar e exibir informações do passageiro.
 */
public class Passageiro {

    private String nome;
    private int idade;
    private String destino;

    /**
     * Construtor da classe Passageiro.
     *
     * @param nome Nome do passageiro.
     * @param idade Idade do passageiro.
     * @param destino Destino atual do passageiro.
     */
    public Passageiro(String nome, int idade, String destino) {
        this.nome = nome;
        this.idade = idade;
        this.destino = destino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDestino() {
        return destino;
    }


    /**
     * Define o destino do passageiro.
     *
     * @param destino O novo destino do passageiro.
     */
    public void setDestino(String destino) {
        this.destino = destino;
        System.out.println(nome + " alterou seu destino para: " + destino);
    }


    //Exibe as informações do passageiro, incluindo nome, idade e destino.
    public void exibirInfo() {
        System.out.println("Passageiro: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Destino: " + destino);
    }
}
