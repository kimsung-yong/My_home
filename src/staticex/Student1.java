package staticex;

public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentLee = new Student();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNumber);
		studentLee.serialNumber++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNumber);
		System.out.println(studentLee.serialNumber);
		
	}

}
