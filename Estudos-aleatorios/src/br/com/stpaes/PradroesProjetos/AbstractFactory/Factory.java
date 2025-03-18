package br.com.stpaes.PradroesProjetos.AbstractFactory;

public abstract class Factory {

    public Car createCar(String requestedGrade) {
        Car car = retrieveCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car) {
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        return car;
    }

    abstract Car retrieveCar(String requestedGrade);

}
