package PracticeProblom;

public class PracticeProblomP197Q5_PersonTest {

	public static void main(String[] args) {
		PracticeProblomP197Q5_Person personKim = new PracticeProblomP197Q5_Person("김장군",35000);
		PracticeProblomP197Q5_Person personLee = new PracticeProblomP197Q5_Person("이순신",15000);
		
		personKim.purChase(4000);
		personLee.purChase(4500);
		
        personKim.showInfo();
        personLee.showInfo();
        
        Store.sell(4000);
        Store.sell(4500);
	}

}
