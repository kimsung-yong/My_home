package ksyjava;

public class ForExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 4;
        int b = a/2+1;
        int c = 1;
		
			for(int i =0; i<a;i++) {
				for(int j = 0 ; j<b; j++) {
					System.out.print(" ");
				}
				for(int j = 0 ; j<c; j++) {
					System.out.print("*");
				}
				for(int j = 0 ; j<b; j++) {
					System.out.print(" ");
				}
				b = b -1;
				c = c +2;
				System.out.println();
				
				
			}
		
		
	}

}
