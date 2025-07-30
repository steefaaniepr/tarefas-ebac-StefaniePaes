package br.com.stpaes;

public class Pessoa {

    String nome;
    String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
