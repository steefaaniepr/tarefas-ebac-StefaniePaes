package br.com.stpaes.domain.FORWHILE;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TabuadaDoWhile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String resposta = "";
        do {
            System.out.println("Digite um número para gerar a tabulada: ");
            int num = s.nextInt();
            for (int i = 0; i <=10; i++) {
                System.out.println(num + " X " + i + " = " + num * i);
            }

            System.out.println("Deseja gerar novamente a tabulada de algum número? ");
            resposta = s.next();
        } while (resposta.equalsIgnoreCase("Sim"));

        System.out.println("Obrigado. ");
    }
}

