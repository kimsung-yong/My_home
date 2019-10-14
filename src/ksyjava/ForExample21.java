package ksyjava;

public class ForExample21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =2;
		int y =1;
		int agv;
		for(;x<10;x++) {
			
			for(;y<10;y++) {
				agv = x*y;
				
				System.out.print(x+"X"+y+"="+agv+" ");
				
			}
			
		
			System.out.println();
		}
			
	}

}