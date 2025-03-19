package br.com.stpaes.PradroesProjetos.Adapter;

public class GoogleDrive {

    void send(byte[] data, String name) {
        System.out.println("Arquivo " + name + " enviado com sucesso!");
    }

    byte [] get(String name) {
        System.out.println("Arquivo " + name + " baixado com sucesso!");
        return new byte[0];
    }
}
