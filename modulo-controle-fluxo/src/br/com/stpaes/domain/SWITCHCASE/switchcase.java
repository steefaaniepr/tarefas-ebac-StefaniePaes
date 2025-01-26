package br.com.stpaes.domain.SWITCHCASE;

import java.util.Scanner;

public class switchcase {

    //A principal vantagem de usar o switch case em Java é a organização e a clareza que ele traz para o seu código,
    // especialmente quando você tem que lidar com múltiplas condições baseadas no mesmo valor de uma variável.
    // Ao invés de usar uma longa cadeia de if-else, que pode ficar confusa e sujeita a erros, o switch case permite que você estruturalmente lide com cada caso de forma mais clara.

    //Por exemplo, imagine que você precise verificar o nome de um mês com base em um número (1 para janeiro, 2 para fevereiro, etc.).
    // Usando switch case, você escreve de uma maneira organizada sem repetir a comparação da variável em cada if.

    //Mas lembre-se, o switch case é mais útil quando a variável que você está avaliando é discreta (como int, char, ou enums) e você tem um conjunto bem definido de valores a serem comparados.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    private static String getIdade(int idade) {
        String result;
        switch (idade) {
            case 0:
            case 5:
                result = "Você é um bebê";
                break;
            case 6:
            case 10:
                result = "Você é uma criança";
                break;
            case 11:
            case 18:
                result = "Você é um adolescente";
                break;
            default:
                result = "Você é um adulto";
                break;
        }
        return result;
    }
}
