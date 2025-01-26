package br.com.stpaes.domain.FORWHILE;

import java.util.ArrayList;
import java.util.List;

public class forewhile {

    public static void main(String[] args) {

        // Exemplo 1
        for (int i = 0; i < 10; i++) {
            System.out.println("Linha " + i);
        }

        // Exemplo 2
        List<Integer> valores = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Linha " + i);
            valores.add(i);
        }

        for (Integer i : valores) {
            System.out.println("Linha " + i);
        }

        valores.forEach(i-> System.out.println("Linha " + i));
    }
}
