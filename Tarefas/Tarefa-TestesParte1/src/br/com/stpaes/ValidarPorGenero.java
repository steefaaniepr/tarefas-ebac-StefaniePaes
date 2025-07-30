package br.com.stpaes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidarPorGenero {

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

        List<Pessoa> mulheres = validarPorGenero(pessoas);
        mulheres.forEach(System.out::println);
    }

    public static List<Pessoa> validarPorGenero(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());
    }
}
