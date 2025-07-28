package br.com.stpaes.Streams;

import java.util.List;
import java.util.Objects;

public class Pessoa {

    String name;
    String sexo;
    public Pessoa() {

    }

    public Pessoa(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    public Pessoa(Pessoa pessoa) {
        this(pessoa.name, pessoa.sexo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Pessoa> pessoaList() {
        Pessoa pessoa1 = new Pessoa("Alexandre", "Masculino");
        Pessoa pessoa2 = new Pessoa("Tania","Feminino");
        Pessoa pessoa3 = new Pessoa("Pamela", "Feminino");
        Pessoa pessoa4 = new Pessoa("Jessy","Masculino");
        Pessoa pessoa5 = new Pessoa("Ana","Feminino");
        Pessoa pessoa6 = new Pessoa("Raniele", "Feminino");
        Pessoa pessoa7 = new Pessoa("Jacira", "Feminino");
        Pessoa pessoa8 = new Pessoa("Ricardo",  "Masculino");
        Pessoa pessoa9 = new Pessoa("João", "Masculino");
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6,pessoa7, pessoa8,pessoa9);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
