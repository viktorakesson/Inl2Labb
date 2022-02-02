package two;

public class CarFactory {

    static Car createCar(TypeOfCar typeOfCar) {
        return
                switch (typeOfCar) {
                    case BIG -> new Big();
                    case SMALL -> new Small();
                };
    }

}
