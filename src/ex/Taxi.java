package ex;

public class Taxi {


	String taxiNumber;
	int money;
	int raceNumber;
	
	public Taxi(String taxiNumber) {
	    this.taxiNumber = taxiNumber;
		
	}
	
	public void take(int money) {
		this.money += money;
		raceNumber++;
	}
	
	public void showInfo() {
		System.out.println("�ýù�ȣ��" + taxiNumber+ "�̰�,�����" +money+ "�Դϴ�");
				
	}

	
		
	}
