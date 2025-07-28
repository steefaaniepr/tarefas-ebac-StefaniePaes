package br.com.stpaes.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemplosFilter {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();
        Stream<Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
        stream.forEach( p -> System.out.println(p.getNome()));

        System.out.println("******");
        System.out.println("******");

        Predicate<Pessoa> pred = pessoa -> pessoa.getNacionalidade().equals("Brasil");
        Stream<Pessoa> stream1 = lista.stream().filter(pred);
        stream1.forEach( p -> System.out.println(p.getNome()));

        System.out.println("******");
        System.out.println("******");

        Predicate<Pessoa> pred1 = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Brasil");
            }
        };

        Stream<Pessoa> stream2 = lista.stream().filter(pred1);
        stream2.forEach( p -> System.out.println(p.getNome()));
    }
}
