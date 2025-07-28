package br.com.stpaes.Collecton.Set;

//    HashSet não tem ordem.
//    O acesso aos dados é mais rápido que em um TreeSet, ams nada garante que os dados estarem ordenados.
//    Não repete valores na lista.

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemascendente();
    }

    private static void exemploListaSimplesOrdemascendente() {
        System.out.println("*** Lista de Ordem Ascendente ***");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio da Silva");
        lista.add("Lucia Ferreira");
        //Collections.sort(lista);
        System.out.println(lista);
        System.out.println(" ");
    }


    //Não repete valores na lista
    private static void exemploListaSimples() {
        System.out.println("*** Lista Simples ***");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lucia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println(" ");
    }


}
