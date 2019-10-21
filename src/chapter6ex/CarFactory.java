package chapter6ex;



public class CarFactory {
	
	
	private static CarFactory car = new CarFactory();
	private CarFactory() {
		
		
	}
	
	public static CarFactory getInstance() {
		 if(car == null) {
			 CarFactory car = new CarFactory();
			 return car;
		 }
		 else return car;
	}
	
	Car creatCar() {
		return new Car();
	
	}
}
