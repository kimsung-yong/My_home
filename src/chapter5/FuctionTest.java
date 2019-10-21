package chapter5;

public class FuctionTest {

	public static void main(String[] args) {
		int num1 = 1040;
		int num2 = 30;
		
		Fuction ac = new Fuction();
		int i = ac.add(num1, num2);
		System.out.println(ac.add(num1, num2));
		System.out.println(ac.subtract(num1, num2));
		System.out.println(ac.multiply(num1, num2));
		System.out.println(ac.dividing(num1, num2));
		
	}

}
