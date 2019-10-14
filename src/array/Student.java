package array;

public class Student {

	private String studentID;
	private String name;
	
	Student(){
		
	}
	
	Student(String studentID,String name){
		this.studentID = studentID;
		this.name = name;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(studentID+","+name);
	}
}
