package br.com.stpaes.Streams;

import java.util.List;

public class ExemploForEach {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();
        lista.stream().forEach(pessoa ->  System.out.println(pessoa.getNome()));

        System.out.println("******");
        System.out.println("******");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .forEach( p -> System.out.println(p.getNome()));

        System.out.println("******");
        System.out.println("******");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade)
                .forEach(System.out::println);
    }
}
