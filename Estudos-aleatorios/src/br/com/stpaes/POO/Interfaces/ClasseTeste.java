package br.com.stpaes.POO.Interfaces;

public class ClasseTeste {

    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Stefanie");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Olá Stefanie");
        giz.escreverComumATodas();
        System.out.println(giz.getCor());

        Lapis lapis = new Lapis();
        lapis.escrever("Olá Stefanie");
        lapis.escreverComumATodas();
        System.out.println(lapis.getCor());
    }
}
