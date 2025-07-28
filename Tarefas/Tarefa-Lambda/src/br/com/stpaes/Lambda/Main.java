package br.com.stpaes.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        //Estrutura Básica Lambda
        // (parametros) -> {corpo da função};
        // Mas se o corpo for simples, pode até tirar as chaves.
        // (x) -> x * 2;


        List<String> nomes = Arrays.asList("Stefanie", "Tania", "Alexandre", "Jessy");
        Collections.sort(nomes, (a,b) -> a.compareTo(b));
        System.out.println(nomes);

        //OU

        List<String> nomes2 = Arrays.asList("Pamela", "Ana", "Ricardo");
        nomes.sort(String::compareTo);
        System.out.println(nomes2);

        Predicate<Integer> ePar = numero -> numero % 2 == 0;
        System.out.println(ePar.test(1));
        System.out.println(ePar.test(2));

        Consumer<String> imprimirMaiusculo = texto -> System.out.println(texto.toUpperCase());
        imprimirMaiusculo.accept("Maiusculo");
        imprimirMaiusculo.accept("Modulo 20");

        Function<String, Integer> contarCaracteres = s -> s.length();
        int tamanho = contarCaracteres.apply("Stefanie");
        System.out.println("Tamanho: " + tamanho);

        //OU

        Function<String, Integer> contarCaracteres2 = String::length;
        int tamanho2 = contarCaracteres.apply("MODULO 20");
        System.out.println("Tamanho: " + tamanho2);



    }
}
