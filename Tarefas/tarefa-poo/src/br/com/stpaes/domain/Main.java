package br.com.stpaes.domain;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Stefanie", "Rua A, 97", "123.456.789-00", "16/02/1996");
        PessoaJuridica pj = new PessoaJuridica("Stefanie", "Rua A, 97", "123.456.789/0000", "ABC Stefanie");

        System.out.println("--- Dados do Pessoa Fisica ---");
        pf.exibirDados();

        System.out.println("--- Dados do Pessoa Juridica ---");
        pj.exibirDados();
    }
}
