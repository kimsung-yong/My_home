package ksyjava;

public class ContinueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int total = 0;
		for(;i<5;i++) {
			if(i % 2 ==0)
				continue;
		    total = total + i;
		}
		System.out.println(total);
		
	}

}
