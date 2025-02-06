package br.com.stpaes.domain;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String cnpj, String razaoSocial) {
      super(nome, endereco);
      this.cnpj = cnpj;
      this.razaoSocial = razaoSocial;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razão Social: " + razaoSocial);
    }
}
