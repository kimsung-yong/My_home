package staticex;

public class Student2 {

	private static int serialNumber = 1000;
	
	public static int getSerialNumber() {
		int i = 10;
		return serialNumber;
	}

	public static void setSerialNumber(int serialNumber) {
		Student2.serialNumber = serialNumber;
	}

	public int studentID;
	
	public String studentName;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName =name;
	}
		
	public int grade;
	public String address;
	
	public Student2() {
		serialNumber++;
		studentID = serialNumber;
	}
	
	
	
	
}
