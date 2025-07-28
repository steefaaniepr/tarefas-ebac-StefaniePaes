package br.com.stpaes.ControleFluxo.ForWhile;

import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um valor para a tabuada: ");
        int num = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
        s.close();
    }
}
