package PracticeProblom;

public class CardCompany {
		static int cardNum = 1000;
		String student_Name;
		public CardCompany() {
		cardNum++;
		}
		
		public CardCompany(String name) {
			this.student_Name = name;
			
		}
		
		public void showInfo() {
			System.out.println(student_Name+"���� �й���"+cardNum+"�Դϴ�");
		}
}
