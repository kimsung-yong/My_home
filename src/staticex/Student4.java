package staticex;

public class Student4 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이진원");
		System.out.println(Student2.getSerialNumber());
		System.out.println(studentLee.getSerialNumber() +"학번:"+studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentLee.setStudentName("손수경");
		System.out.println(Student2.getSerialNumber());
		System.out.println(studentSon.getSerialNumber() +"학번:"+studentSon.studentID);
	}
}
