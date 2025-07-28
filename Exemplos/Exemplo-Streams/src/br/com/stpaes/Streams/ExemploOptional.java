package br.com.stpaes.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().populaPessoa();

        Optional<Pessoa> opcional = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade));
        opcional.ifPresent(System.out::println);

        //OU

        if (opcional.isPresent()) {
            System.out.println(opcional.get());
        }


        Optional<Pessoa> min = lista.stream()
                .min(Comparator.comparing(Pessoa::getIdade));

        //OU

        min.ifPresentOrElse(System.out::println, new Runnable() {
            @Override
            public void run() {

            }
        });
        Pessoa value = min.orElseThrow();


    }
}
