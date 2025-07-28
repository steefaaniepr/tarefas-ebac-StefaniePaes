package br.com.stpaes.PradroesProjetos.Adapter;

import java.io.File;
import java.io.IOException;

public interface IPersistencia {

    void gravar(File file);
    File ler(String id);
}
