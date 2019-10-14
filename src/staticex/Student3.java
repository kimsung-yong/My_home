package staticex;

public class Student3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.getSerialNumber());
		System.out.println(studentLee.studentName+"학번:"+studentLee.getSerialNumber());
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.getSerialNumber());
		System.out.println(studentSon.studentName+"학번:"+studentSon.getSerialNumber());
		
	}

}
