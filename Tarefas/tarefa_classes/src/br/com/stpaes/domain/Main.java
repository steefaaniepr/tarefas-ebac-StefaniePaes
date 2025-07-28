package br.com.stpaes.domain;

/**
 * Classe principal para simular as operações de um ônibus, motorista e passageiros.
 */
public class Main {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Carlos", "ABC");
        Onibus onibus1 = new Onibus(3,"São Paulo", 0);
        Passageiro passageiro1 = new Passageiro("Stefanie", 28, "São Paulo");
        Passageiro passageiro2 = new Passageiro("Tania", 50, "Aeroporto Cangunhas");

        // Exibindo status iniciais
        motorista1.exibirStatus();
        System.out.println("---------------------------------------");
        onibus1.exibirStatus();
        System.out.println("---------------------------------------");

        //Ligando o onibus
        motorista1.iniciarDirecao();
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        //enbarcando os clientes
        onibus1.embarcarPassageiro();
        onibus1.embarcarPassageiro();
        System.out.println("---------------------------------------");


        onibus1.exibirStatus();
        System.out.println("---------------------------------------");

        //detalhes sobre os passageiros
        passageiro1.exibirInfo();
        passageiro2.exibirInfo();
        System.out.println("---------------------------------------");

        //desembargando os passageiros
        motorista1.desligarDirecao();
        onibus1.desembarcarPassageiro();
        onibus1.desembarcarPassageiro();
        System.out.println("--------------------------------------");

        //finalizando corrida.
        onibus1.exibirStatus();
        motorista1.exibirStatus();
        System.out.println("---------------------------------------");
    }
}
