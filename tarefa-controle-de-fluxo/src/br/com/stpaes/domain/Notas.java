package br.com.stpaes.domain;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double notaSoma = 0;
        for (double i = 1; i <= 4; i++) {
            System.out.println("Digite sua nota " + i);
            double nota = s.nextDouble();
            notaSoma += nota;
        }

        double media = notaSoma / 4;
        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("Aluno Aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno em Recuperacao");
        } else {
            System.out.println("Aluno Reprovado");
        }

        s.close();
    }
}
