package br.com.stpaes.ControleFluxo.ForWhile;

import java.util.Scanner;

public class TabuadaWhlie {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar a tabuada de algum número? ");
        String resposta = s.nextLine();

        while (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Digite um número para gerar a tabulada: ");
            int num = s.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println(num + " X " + i + " = " + (num * i));
            }

            System.out.println("Deseja novamente gerar a tabuada de algum número? ");
            resposta = s.nextLine();

        }

        System.out.println("Obrigada. ");
    }
}
