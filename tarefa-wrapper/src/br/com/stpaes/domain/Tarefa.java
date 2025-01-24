package br.com.stpaes.domain;

public class Tarefa {

    public static void main (String [] args) {

        int idade = 28;
        System.out.println("Valor primitivo int: " + idade);

        int idade2 = Integer.valueOf(idade);
        System.out.println("Valor como Wrapper (Integer): " + idade2);

    }
}
