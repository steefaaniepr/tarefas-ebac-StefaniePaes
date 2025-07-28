package br.com.stpaes.Streams;

import java.util.List;

public class ExemploCount {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();

        long count = lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M"))
                .count();
        System.out.println(count);
    }
}
