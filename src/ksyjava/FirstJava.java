/*
 * Date :2018 �� 5�� 8�� 
 * Author : ������
 * Description : ù ��° �ڹ� ���α׷� �Դϴ�.
 * Version : 1.0
 */


package ksyjava;

public class FirstJava {

	public static int add(int x,int y){
		
		
		int result = x+y;
		return result;
		
	}
	
	public static int SubTraction(int x, int y) {
		int result;
		
		result = x - y;
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello Java");
		
		int t = add(100,120);
		
		System.out.println(t);
		
		int sT = SubTraction(400,130);
		
		System.out.println(sT);
	}
	
	
	

}
