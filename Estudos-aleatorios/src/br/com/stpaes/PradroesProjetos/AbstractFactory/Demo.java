package br.com.stpaes.PradroesProjetos.AbstractFactory;

public class Demo {

    public static void main(String[] args) {
        Custumer cliente = new Custumer("A", false);
        Factory factory = getFactory(cliente);
        Car car = factory.createCar(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Custumer cliente) {
        if (cliente.hasCompanyContract()) {
            return new ContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }
}
