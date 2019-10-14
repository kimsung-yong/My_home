package staticex;

public class Student7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student6 studentKim = new Student6("김아인");
		Student6 studentHan = new Student6("한기민");
		
		System.out.println("카드넘버:"+studentHan.studentCardNumber+"학번:"+studentHan.studentNumber+"이름:"+studentHan.studentName);
		System.out.println("카드넘버:"+studentKim.studentCardNumber+"학번:"+studentKim.studentNumber+"이름:"+studentKim.studentName);
	}

}
