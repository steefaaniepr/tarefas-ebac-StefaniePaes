package br.com.stpaes.PradroesProjetos.Observer;

public class Demo {

    public static void main(String[] args) {

        Jornalista jour = new Jornalista();
        jour.registerObserver(new Newspaper());
        jour.registerObserver(new Tv());
        jour.registerObserver(new Radio());

        jour.publish("teste", "sasassa", "ola", "Texto aqui");
    }
}
