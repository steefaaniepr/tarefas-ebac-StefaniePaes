package br.com.stpaes.PradroesProjetos.Singleton;

public class SingletonPropriedadeSyncronized {

    private static SingletonPropriedadeSyncronized singleton;
    private String value;

    private SingletonPropriedadeSyncronized(String value) {
        this.value = value;
    }

    public static synchronized SingletonPropriedadeSyncronized getInstance(String value) {
        if (singleton == null) {
            singleton = new SingletonPropriedadeSyncronized(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
