package staticex;

public class Student4 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("������");
		System.out.println(Student2.getSerialNumber());
		System.out.println(studentLee.getSerialNumber() +"�й�:"+studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentLee.setStudentName("�ռ���");
		System.out.println(Student2.getSerialNumber());
		System.out.println(studentSon.getSerialNumber() +"�й�:"+studentSon.studentID);
	}
}
