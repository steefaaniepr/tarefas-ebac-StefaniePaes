package br.com.stpaes.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TarefaP2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes como Nome-Sexo, separados por vírgula:");
        String resultado = s.nextLine();
        s.close();

        String[] resultados = resultado.split("\\s*,\\s*");

        List<String> feminino = new ArrayList<>();
        List<String> masculino = new ArrayList<>();

        for (String item : resultados) {
            String[] items = item.split("\\s*-\\s*"); // Separa nome e sexo

            if (items.length == 2) {
                String nome = items[0].trim();
                String sexo = items[1].trim().toUpperCase();

                if (sexo.equals("F")) {
                    feminino.add(nome);
                } else if (sexo.equals("M")) {
                    masculino.add(nome);
                } else {
                    System.out.println("Entrada inválida ignorada: " + item);
                }
            } else {
                System.out.println("Formato inválida ignorado: " + item);
            }
        }

        feminino.sort(String.CASE_INSENSITIVE_ORDER);
        masculino.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("\n----- Grupo Feminino -----");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        System.out.println("\n----- Grupo Masculino -----");
        for (String nome : masculino) {
            System.out.println(nome);
        }
    }
}