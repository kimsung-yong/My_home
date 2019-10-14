package chapter5;

public class Student {

	int studentId;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public static void main(String[] argvs) {
		Student studentAnn = new Student();
		studentAnn.studentName = "¾È¿¬¼ö";
		
		System.out.println(studentAnn.studentName);
		System.out.println(studentAnn.getStudentName());
	}
}

