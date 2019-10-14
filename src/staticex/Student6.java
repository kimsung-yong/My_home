package staticex;

public class Student6 {

	 int studentCardNumber;
	int studentNumber = 1000;
	String studentName;
	
	public Student6() {
		
	}

	public int getStudentCardNumber() {
		return studentCardNumber;
	}

	public void setStudentCardNumber(int studentCardNumber) {
		this.studentCardNumber = studentCardNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public Student6(String name) {
		this.studentName = name;
	    this.studentCardNumber = this.studentNumber+100;
	    studentNumber++;
	}
	
	
}
