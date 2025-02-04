package br.com.stpaes.POO.Heranca;

public class Programa {
    public static void main(String[] args) {

        Assalariado assalariado = new Assalariado();
        assalariado.setCpf("1");
        assalariado.setNome("Stefanie");
        assalariado.setSobrenome("Paes");
        assalariado.setSalario(1300d);
        imprimir(assalariado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Stefanie2");
        comissionado.setSobrenome("Paes");
        comissionado.setTotalVenda(2000d);
        comissionado.setTaxaComissao(0.1d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("3");
        horista.setNome("Stefanie3");
        horista.setSobrenome("Paes");
        horista.setHorasTrabalhadas(176d);
        horista.setPrecoHora(100d);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {
        System.out.println(empregado.getNome() + "Tem salario " + empregado.vencimento());
    }
}
