package array;

public class BookArray2 {

	public static void main(String[] args) {
		Book[] librray = new Book[5];
		librray[0] = new Book("�¹���","������");
		librray[1] = new Book("���̾�","�츣�� �㼼");
		librray[2] = new Book("��� ����ΰ�","���ù�");
		librray[3] = new Book("����","�ڰ渮");
		librray[4] = new Book("�����","�������丮");
		
		for(int i = 0; i<librray.length;i++) {
			librray[i].showInfo();
		}
		for(int i =0; i<librray.length;i++) {
			System.out.println(librray[i]);
		}
	} 
	
	
}
