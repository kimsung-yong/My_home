package chapter5;
import java.util.Scanner;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��Ģ���� �޼ҵ� �Դϴ� ù��° ���� �ι�° ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int n1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int n2 = sc.nextInt();
		System.out.println("��Ģ������ �Է��ϼ��� ex)+,-,*,/");
//		int n3 = sc.nextInt();
		String n3 = sc.next();
		
		System.out.println(n3);
		if(n3 == "+") {
		int sum = add(n1,n2);
		System.out.println(sum+" ����");
		
		}
		
		else if(n3 == "-"){
		int subtract = subtract(n1,n2);
		System.out.println(subtract+" ����");
		
		}
		
		else if(n3 == "*") {
		int multiply = multiply(n1, n2);
		System.out.println(multiply+" ���ϱ�");
		
		}
		 
		else if(n3 == "/") {
		int divide = divide(n1,n2);
		System.out.println(divide+" ������");
		}
		
		else
			System.out.println("�߸��Է��Ͽ����Ƿ� �����մϴ�");
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
