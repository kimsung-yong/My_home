package ksyjava;

public class ForExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 7; //ÁÙ
        int b = a/2+1; // ºó°ø°£
        int c = 1; // º°
		
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
				
				if(i <3 ) {
				b = b -1;
				c = c +2;
				System.out.println();
				}
				else if(i >=3) {
					b = b +1;
					c = c -2;
					System.out.println();
				}
				
			}

	}
}
		