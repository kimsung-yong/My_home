package ex;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isVaild());
		
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isVaild());
	}

}
