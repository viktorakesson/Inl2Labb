package two;

public class Main {

    public static void main(String[] args) {

        Car big1 = CarFactory.createCar(TypeOfCar.BIG);
        Car small1 = CarFactory.createCar(TypeOfCar.SMALL);

        big1.engineSound();
        small1.engineSound();

    }

}
