package br.com.stpaes.Streams;

import java.util.List;
import java.util.stream.Stream;

public class ExemploLimit {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();
        Stream<Pessoa> stream = lista.stream().limit(2);
    }
}
