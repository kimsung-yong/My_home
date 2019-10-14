package constructor;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5f;
		personKim.height = 180.0f;
		
		Person personlee = new Person("이순신", 175, 75);
		
		System.out.print("이름 "+personKim.name+" ");
		System.out.print("몸무게 "+personKim.weight+" ");
		System.out.print("키 "+personKim.height+" ");
		
		System.out.println();
		System.out.print("이름 "+personlee.name+" ");
		System.out.print("몸무게 "+personlee.weight+" ");
		System.out.print("키 "+personlee.height+" ");
	}

}
