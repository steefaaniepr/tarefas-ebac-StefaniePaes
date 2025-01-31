package br.com.stpaes.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TarefaP1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgulas: ");
        String nomes = s.nextLine();
        s.close();

        String[] nomesJuntos = nomes.split("\\s*,\\s*"); // Assim tira a vírgula e os espaços
        List<String> nome = new ArrayList<String>(Arrays.asList(nomesJuntos)); // usei para converter diretamente para ArrayList.
        System.out.println(nome);

        nome.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("-----Nomes Ordenados-----");
        for (String resultado : nome) {
            System.out.println(resultado);
        }
    }
}
