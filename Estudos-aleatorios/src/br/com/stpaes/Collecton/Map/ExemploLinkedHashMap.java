package br.com.stpaes.Collecton.Map;

//A ordem de iteração é a ordem em que as chaves são inseridas no mapa.

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHashMap {
    public static void main(String args[]) {
        exemploListaSimples();
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        Map<Integer, String> lista = new LinkedHashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(4, "João da Silva");
        lista.put(3, "Lúcia Ferreira");

        System.out.println(lista);
        System.out.println("");
    }
}
