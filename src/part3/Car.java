package part3;

public class Car {
	//맴버필드 Field
	private int speed = 0;
	private int direction = 0;
	//생성자 constructor
	public Car() {
		
	}
	//매서드
	public void speedUp() {
		speed += 5;
	}
	public void speedDown() {
		speed -=5;
	}
	public int getSpeed() {
		return speed;
	}
	public void turnDirect(int dir) {
		direction += dir;
	}
	public int getDirect() {
		return direction;
	}
	
	
}
