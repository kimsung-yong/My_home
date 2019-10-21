package chapter5;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showInfO() {
		System.out.println(studentName +"," + address);
	}
	
	void setStudentName(String name) {
		this.studentName = name;
	}
	String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] argvs) {
		Student studentKim = new Student();
		studentKim.setStudentName("±è¹Ì¶ó");
		System.out.println(studentKim.getStudentName());
		
		
	}
}
