package br.com.stpaes.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TarefaP2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgulas: ");
        String resultado = s.nextLine();,
        s.close();
        String[] resultados = resultado.split("\\s*,\\s*");

        List<String> feminino = new ArrayList<>();
        List<String> masculino = new ArrayList<>();

    }
}
