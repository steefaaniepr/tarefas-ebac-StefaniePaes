package br.com.stpaes.Streams;

import java.util.List;

public class ExemploAllMatch {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();

        boolean result = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));
        System.out.println(result);

        //Metodo convencional
        Boolean re = true;
        for (Pessoa p : lista){
            if (!p.getNacionalidade().equals("Mexico")){
                re = false;
                break;
            }
        }
    }
}
