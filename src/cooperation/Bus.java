package cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumbur) {
		this.busNumber = busNumbur;
	}
	
	public void take(int money) {
		this.money = money;
	}
	
	public void showInfo() {
		System.out.println("����"+busNumber+"���� �°���"+passengerCount+"�� �̰�,"+"������"+money+"�Դϴ�");
		
		
		
		
		
		
	}
}
