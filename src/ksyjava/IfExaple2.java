package ksyjava;

public class IfExaple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 7;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동 입니다"); 
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다");
		}
		else if(age < 20) {
			charge = 3000;
			System.out.println("중,고등학생입니다");
		}
		else {
			charge = 4000;
			System.out.println("성인입니다");
		}
		
		System.out.println("입장료는"+charge+"입니다");
	}

}
