package br.com.stpaes.domain;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String dataNascimento;


    public PessoaFisica(String nome, String endereco,String cpf, String dataNascimento) {
        super(nome, endereco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }


}
