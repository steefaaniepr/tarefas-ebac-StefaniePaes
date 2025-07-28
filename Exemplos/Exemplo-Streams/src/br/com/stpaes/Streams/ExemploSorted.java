package br.com.stpaes.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploSorted {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoa();

        Stream stream = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        Stream stream1 = pessoas.stream()
                .filter(e -> e.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getIdade));

        stream1.forEach(i -> System.out.println(i));

        Stream<Pessoa> stream2 = pessoas.stream()
                .filter(e -> e.getNacionalidade().equals("Brasil"))
                .sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));
        stream2.forEach(i -> System.out.println(i));
    }
}
