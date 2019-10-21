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
		System.out.println("카페의 벌으들인 금액은" + storeMoneyBox);
	}
	
	
	
	
}
