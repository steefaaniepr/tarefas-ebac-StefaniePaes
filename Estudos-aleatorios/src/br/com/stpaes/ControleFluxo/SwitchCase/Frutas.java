package br.com.stpaes.ControleFluxo.SwitchCase;

public class Frutas {
    public static void main(String[] args) {
        String fruta = "maça";

        switch (fruta) {
            case "banana":
                System.out.println("Você escolheu Banana");
                break;
            case "maça":
                System.out.println("Você escolheu Maça");
                break;
            case "laranja":
                System.out.println("Você escolheu Laranja");
                break;
            default:
                System.out.println("Fruta desconhecida");
        }
    }
}
