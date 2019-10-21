package chapter6ex;

import ex.CarFactory;

public class Car {
	private static int serialNum = 1000;
	int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}

	public int getCarNum() {
		// TODO Auto-generated method stub
		return carNum;
	}
	
	
}
