package ksyjava;

public class ContinueExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i = 1;
	
	for(;i<100;i++) {
		if(i%3 != 0) {
			continue;
		}
		System.out.println(i);
	}
	
	}

}
