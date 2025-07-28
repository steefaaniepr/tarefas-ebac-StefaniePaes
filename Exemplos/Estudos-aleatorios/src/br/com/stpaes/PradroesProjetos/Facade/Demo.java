package br.com.stpaes.PradroesProjetos.Facade;

public class Demo {

    public static void main(String[] args) {

        IApartamentoService service = new ApartamentoService();
        service.cadastrarApartamento(new Apartamento(1L,"endereço"));
    }
}
