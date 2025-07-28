package br.com.stpaes.PradroesProjetos.TemplateMethod;

public class Bombeiro extends Trabalhador {


    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Bombeiro");
    }
}
