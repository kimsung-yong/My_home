package ksyjava;
/*
 * 100�� ��ȥ�� �ڵ�
 */
public class GradesP100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 88;
		char grade;
		
		if (score >= 90) {
			grade = 'A';
			System.out.println(grade+"�����Դϴ�");
		}
		
		else if (score >= 80) {
			grade = 'B';
			System.out.println(grade+"�����Դϴ�");
		}
		
		else if (score >= 70) {
			grade = 'C';
			System.out.println(grade+"�����Դϴ�");
		}
		
		else if(score >= 60) {
			grade = 'D';
			System.out.println(grade+"�����Դϴ�");
		}
		else {
			grade = 'F';
			System.out.println(grade+"�����Դϴ�");
		}
	}

}
