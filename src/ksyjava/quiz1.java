package ksyjava;
import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요:");
		
		int sc1 = sc.nextInt();
		boolean sc2= (sc1 %4 == 0 && sc1 % 5 == 0);
		boolean sc3 = (sc1 %4 == 0 || sc1 % 5 == 0);
		boolean sc4 = ((sc1 %4 == 0 || sc1 % 5 == 0) && sc1 % 20 !=0);
	
		
		System.out.println(sc2);
		System.out.println(sc3);
		System.out.println(sc4);
	}

}

