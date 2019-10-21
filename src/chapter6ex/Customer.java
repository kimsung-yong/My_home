package chapter6ex;

public class Customer {
	int customerMoneyBox;
	String customerName;
	
	public Customer() {
		
	}
	
	public Customer(String name,int money) {
		this.customerName = name;
		this.customerMoneyBox = money;
	}
	
	int getMoneyBox() {
		return customerMoneyBox;
	}
	
	Store buyAmericano(Store store) {
		store.takeAmericano();
		customerMoneyBox -= store.americano;
		return store;
	}
	
	Store buyLatte(Store store) {
		customerMoneyBox -=store.latte;
		store.takelatte();
		return store;
	}
	
	void customerShowInfo() {
		System.out.println(customerName + "���� ���� ���� �ݾ���" + customerMoneyBox + "�� �Դϴ�");
	}
}
