package chapter6ex;

public class StoreTest {

	public static void main(String[] args) {
		Customer customerKim = new Customer("������",24000);
		Customer customerLee = new Customer("�̼���",30000);
		
		
		Store store = new Store();
		customerKim.buyAmericano(store);
		customerLee.buyLatte(store);
		
		customerKim.customerShowInfo();
		customerLee.customerShowInfo();

	}

}

