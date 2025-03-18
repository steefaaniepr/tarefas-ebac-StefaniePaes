package br.com.stpaes.PradroesProjetos.TemplateMethod;

public class Demo {

    public static void main(String[] args) {

        Trabalhador t = new Bombeiro();
        t.executar();

        System.out.println("---------------------------------");

        Policial p = new Policial();
        p.executar();

        System.out.println("---------------------------------");

        Advogado ad = new Advogado();
        ad.executar();
    }
}
