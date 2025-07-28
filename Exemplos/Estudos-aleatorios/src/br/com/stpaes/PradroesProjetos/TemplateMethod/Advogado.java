package br.com.stpaes.PradroesProjetos.TemplateMethod;

public class Advogado extends Trabalhador{


    @Override
    protected void trabalhar() {
        System.out.println("Trabalando como advogado");
    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Voltando para casa de carro.");
    }

    @Override
    protected void irAoTrabalho() {
        System.out.println("Indo trabalhar  de carro.");;
    }


    @Override
    protected void levantar() {
        System.out.println("Levantando as 8hs");
    }

}
