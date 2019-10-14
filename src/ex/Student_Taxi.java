package ex;

public class Student_Taxi {

	String studentName;
	int money;
	
	public Student_Taxi(String studentName,int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		this.money -= 10000;
		taxi.take(10000);
		
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 금액은 "+money+"입니다");
	}
	
	
}
