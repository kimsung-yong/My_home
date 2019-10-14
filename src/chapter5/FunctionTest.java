package chapter5;
import java.util.Scanner;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("사칙연산 메소드 입니다 첫번째 값과 두번째 값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int n1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int n2 = sc.nextInt();
		System.out.println("사칙연산을 입력하세여 ex)+,-,*,/");
//		int n3 = sc.nextInt();
		String n3 = sc.next();
		
		System.out.println(n3);
		if(n3 == "+") {
		int sum = add(n1,n2);
		System.out.println(sum+" 덧셈");
		
		}
		
		else if(n3 == "-"){
		int subtract = subtract(n1,n2);
		System.out.println(subtract+" 뺄셈");
		
		}
		
		else if(n3 == "*") {
		int multiply = multiply(n1, n2);
		System.out.println(multiply+" 곱하기");
		
		}
		 
		else if(n3 == "/") {
		int divide = divide(n1,n2);
		System.out.println(divide+" 나누기");
		}
		
		else
			System.out.println("잘못입력하였으므로 종료합니다");
	}

	public static int add(int num1,int num2) {
		int result = num1 + num2;
		
		return result;
	}	
	
	public static int subtract(int num1, int num2) {
		int result = num1 - num2;
		
		return result;
	}
	
	public static int multiply(int num1,int num2) {
		int result = num1 * num2;
		
		return result;
	}
	
	public static int divide(int num1,int num2) {
		int result = num1 / num2;
		
		return result;
	}
	
		
}
