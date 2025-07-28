package br.com.stpaes.PradroesProjetos.Singleton;

public class DemoSingletonPropriedade {

    public static void main(String[] args) {

        SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste");
        SingletonPropriedade singleton1 = SingletonPropriedade.getInstance("Teste2");

        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());

    }
}
