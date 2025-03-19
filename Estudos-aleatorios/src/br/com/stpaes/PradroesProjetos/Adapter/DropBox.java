package br.com.stpaes.PradroesProjetos.Adapter;

public class DropBox {

    void upload(DropBoxFile dbFile) {
        System.out.println("Arquivo enviado para o Dropbox: " + dbFile.getLocalPath());
    }

    DropBoxFile download(String id) {
        return new DropBoxFile("C:\\temp\\" + id);
    }
}
