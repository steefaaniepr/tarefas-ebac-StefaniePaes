package br.com.stpaes.Reflexction.Domain;

import br.com.stpaes.Reflexction.Annotation.TipoChave;

public class Produto implements Persistente{

    @TipoChave("getCodigo")
    private Long codigo;

    private String nome;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }

}
