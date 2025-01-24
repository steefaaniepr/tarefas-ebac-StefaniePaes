package br.com.stpaes.domain.IFELSE;

import java.util.Scanner;

public class ExemploAnimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do animal: ");
        String texto = s.nextLine();
        String animal = exampleOfIf(texto);
        System.out.println(animal);
    }

    public static String exampleOfIf(String animal) {
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        } else {
            result = "unknowm animal";
        }
        return result;
    }
}
