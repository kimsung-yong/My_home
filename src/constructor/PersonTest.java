package constructor;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personKim = new Person();
		personKim.name = "������";
		personKim.weight = 85.5f;
		personKim.height = 180.0f;
		
		Person personlee = new Person("�̼���", 175, 75);
		
		System.out.print("�̸� "+personKim.name+" ");
		System.out.print("������ "+personKim.weight+" ");
		System.out.print("Ű "+personKim.height+" ");
		
		System.out.println();
		System.out.print("�̸� "+personlee.name+" ");
		System.out.print("������ "+personlee.weight+" ");
		System.out.print("Ű "+personlee.height+" ");
	}

}
