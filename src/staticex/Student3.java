package staticex;

public class Student3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 studentLee = new Student2();
		studentLee.setStudentName("������");
		System.out.println(studentLee.getSerialNumber());
		System.out.println(studentLee.studentName+"�й�:"+studentLee.getSerialNumber());
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.getSerialNumber());
		System.out.println(studentSon.studentName+"�й�:"+studentSon.getSerialNumber());
		
	}

}
