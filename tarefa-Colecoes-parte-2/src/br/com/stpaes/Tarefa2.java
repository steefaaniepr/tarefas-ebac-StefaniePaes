package br.com.stpaes;

import java.util.*;

public class Tarefa2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes como Nome-Sexo, separados por vírgula:  ");
        String resultado = s.nextLine();
        s.close();

        String[] resultados = resultado.split("\\s*,\\s*");

        Map<String, List<String>> grupos = new HashMap<String, List<String>>();
        grupos.put("Feminino", new ArrayList<>());
        grupos.put("Masculino", new ArrayList<>());

        for (String item : resultados) {
            String[] items = item.split("\\s*-\\s*");

            if (items.length == 2) {
                String nome = items[0].trim();
                String sexo = items[1].trim().toUpperCase();

                if (sexo.equals("F") || sexo.equals("FEMININO")) {
                    grupos.get("Feminino").add(nome);
                } else if (sexo.equals("M") || sexo.equals("MASCULINO")) {
                    grupos.get("Masculino").add(nome);
                } else {
                    System.out.println("Formato inválido: " + item);
                }
            } else {
                System.out.println("Formato inválido: " + item);
            }
        }

        grupos.get("Feminino").sort(String.CASE_INSENSITIVE_ORDER);
        grupos.get("Masculino").sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("\n ----- Grupo Feminino -----");
        for (String nome : grupos.get("Feminino")) {
            System.out.println(nome);
        }

        System.out.println("\n ----- Grupo Masculino -----");
        for (String nome : grupos.get("Masculino")) {
            System.out.println(nome);
        }
    }
}
