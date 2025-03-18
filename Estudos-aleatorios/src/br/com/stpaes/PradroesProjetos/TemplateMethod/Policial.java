package br.com.stpaes.PradroesProjetos.TemplateMethod;

public class Policial extends Trabalhador{

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Policial");
    }
}
