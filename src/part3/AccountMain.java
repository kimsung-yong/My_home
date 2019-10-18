package part3;

public class AccountMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1000);
		acc1.deposit(3000);
		acc1.deposit(2000);
		acc1.withdraw(500);
		System.out.println(acc1.getMoney());
	}

}
