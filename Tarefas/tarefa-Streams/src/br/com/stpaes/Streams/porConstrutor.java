package br.com.stpaes.Streams;

import java.util.List;

public class porConstrutor {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        List<Pessoa> listaOriginal = pessoa.pessoaList();

        List<Pessoa> mulheres = listaOriginal.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("Feminino"))
                .toList();

        System.out.println("** Lista Original ***");
        listaOriginal.forEach(System.out::println);
        System.out.println("****************");
        System.out.println("** Lista de Mulheres ***");
        mulheres.forEach(System.out::println);
    }
}
