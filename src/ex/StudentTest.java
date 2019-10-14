package ex;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentHong = new Student();
		Student studentCham = new Student();
		Student studentGang = new Student();
		
		studentHong.setStudentID("2019101011");
		studentHong.setStudentName("홍나라");
		studentHong.setStudentAge(19);
		studentHong.setStudentPhoneNumber("01021211111");
		
		studentCham.setStudentID("2019101012");
		studentCham.setStudentName("참이슬");
		studentCham.setStudentAge(19);
		studentCham.setStudentPhoneNumber("01021211112");
		
		studentGang.setStudentID("2019101013");
		studentGang.setStudentName("홍나라");
		studentGang.setStudentAge(19);
		studentGang.setStudentPhoneNumber("01021211113");
		
		System.out.print("이름 ");
		System.out.print("      학번");
		System.out.print("        나이");
		System.out.print("      전화번호");
				
		System.out.println();
		System.out.print(studentHong.getStudentName()+" ");
		System.out.print(studentHong.getStudentID()+" ");
		System.out.print(studentHong.getStudentAge()+" ");
		System.out.print(studentHong.getStudentPhoneNumber()+" ");
		System.out.println();
		
		System.out.print(studentCham.getStudentName()+" ");
		System.out.print(studentCham.getStudentID()+" ");
		System.out.print(studentCham.getStudentAge()+" ");
		System.out.print(studentCham.getStudentPhoneNumber()+" ");
		
		System.out.println();
		System.out.print(studentGang.getStudentName()+" ");
		System.out.print(studentGang.getStudentID()+" ");
		System.out.print(studentGang.getStudentAge()+" ");
		System.out.print(studentGang.getStudentPhoneNumber()+" ");
	}
	
	

}
