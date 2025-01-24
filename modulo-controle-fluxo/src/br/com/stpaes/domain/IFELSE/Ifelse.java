package br.com.stpaes.domain.IFELSE;

import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args) {

        //EXEMPLO 1
        System.out.println("---------------------------");
        int result = 0;
        if (result > 1) {
            System.out.println("Resultado maior que 1");
        } else {
            System.out.println("Resultado menor que 1");
        }

        //EXEMPLO 2
        System.out.println("---------------------------");
        if (result > 1 && result < 5) {
            System.out.println("Resultado está entre 2 e 4");
        } else if (result >= 5 && result < 8) {
            System.out.println("Resultado está entre 5 e 7");
        } else {
            System.out.println("Resultado diferentes dos anteriores");
        }

        //EXEMPLO 3
        System.out.println("---------------------------");
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = s.nextInt();
        if (num > 1) {
            System.out.println("Resultado maior que 1");
        } else {
            System.out.println("Resultado menor que 1");
        }

        //EXEMPLO 4
        System.out.println("---------------------------");
        if (num == 1) {
            System.out.println("Resultado é igual a 1");
        } else if (num >= 5 && num < 8) {
            System.out.println("Resultado está entre 5 e 7");
        } else {
            System.out.println("Resultado diferentes dos anteriores");
        }
    }
}
