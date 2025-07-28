package br.com.stpaes.Collecton.List.LinkedList;

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
