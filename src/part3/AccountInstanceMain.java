package part3;

public class AccountInstanceMain {

	public static void main(String[] args) {
		Account aac1 = new Account();
		Account aac2 = new Account(1000);
		Account aac3 = new Account(1000);
				
		System.out.println(aac2 == aac3);
		System.out.println(aac3.equals(aac3));

	}

}
