package part3;

public class Car {
	//�ɹ��ʵ� Field
	private int speed = 0;
	private int direction = 0;
	//������ constructor
	public Car() {
		
	}
	//�ż���
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
