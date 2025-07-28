package br.com.stpaes.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class porScanner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite nome e sexo separado por vírgulas (ex: Ana-Feminino,João-Masculino): ");
        String nomes = s.nextLine();
        s.close();

        for (String item : nomes.split(",")) {
                String[] partes = item.trim().split("-");
                if (partes.length == 2) {
                    String nome = partes[0].trim();
                    String sexo = partes[1].trim();
                    pessoas.add(new Pessoa(nome, sexo));
            }
        }

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("Feminino"))
                .toList();
        mulheres.forEach(System.out::println);
    }
}
