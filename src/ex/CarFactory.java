package ex;

 

public class CarFactory {

    private static CarFactory instance = new CarFactory();

    private CarFactory() {
    }

    public static Car creatCar() {

    	Car car = new Car();

    	return car;
    }
    public static CarFactory getInstance() {

    	return instance;
    }
}

 

