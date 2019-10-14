package array;

public class BookArray2 {

	public static void main(String[] args) {
		Book[] librray = new Book[5];
		librray[0] = new Book("태백산맥","조정례");
		librray[1] = new Book("데미안","헤르만 허세");
		librray[2] = new Book("어떻게 살것인가","유시민");
		librray[3] = new Book("토지","박경리");
		librray[4] = new Book("어린왕자","생택쥐페리");
		
		for(int i = 0; i<librray.length;i++) {
			librray[i].showInfo();
		}
		for(int i =0; i<librray.length;i++) {
			System.out.println(librray[i]);
		}
	} 
	
	
}
