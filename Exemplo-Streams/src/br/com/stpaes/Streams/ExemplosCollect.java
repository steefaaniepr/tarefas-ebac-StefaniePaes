package br.com.stpaes.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class ExemplosCollect {

    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().populaPessoa();

        List<Pessoa> listaB = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .toList();
        listaB.forEach(System.out::println);

        System.out.println("******");
        System.out.println("******");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Canada"))
                .toList()
                .forEach(System.out::println);

        System.out.println("******");
        System.out.println("******");

        Set<Pessoa> set = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toSet());
        set.forEach(System.out::println);

        System.out.println("******");
        System.out.println("******");

        ArrayList<Pessoa> arrayLest = lista.stream()
                .filter(pessoa ->  pessoa.getNacionalidade().equals("Mexico"))
                .collect(Collectors.toCollection(ArrayList::new));
        arrayLest.forEach(System.out::println);

        System.out.println("******");
        System.out.println("******");

        Map<Integer, Pessoa> map = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));
        map.forEach((k, v) -> System.out.println(v));

        System.out.println("******");
        System.out.println("******");

        Map<Integer, List<Pessoa>> agruparPorIdade = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.groupingBy(Pessoa::getIdade));
        agruparPorIdade.forEach((k, v) -> System.out.println(v));
    }
}
