package br.com.stpaes.Collecton.Queue.LinkedList;

public class Chamado {
    String descricao;

    public Chamado(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
