package chapter6ex;

public class Store {
	final static int americano = 4000;
	final static int latte = 4500;
	int storeMoneyBox;
	
	public Store() {
		
	}
	
	void takeAmericano() {
		this.storeMoneyBox += americano;
	}
	
	void takelatte() {
		this.storeMoneyBox += latte;
	}
	
	void storeShowInfo() {
		System.out.println("ī���� �������� �ݾ���" + storeMoneyBox);
	}
	
	
	
	
}
