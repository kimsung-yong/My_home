package PracticeProblom;

public class PracticeProblomP197Q5_PersonTest {

	public static void main(String[] args) {
		PracticeProblomP197Q5_Person personKim = new PracticeProblomP197Q5_Person("���屺",35000);
		PracticeProblomP197Q5_Person personLee = new PracticeProblomP197Q5_Person("�̼���",15000);
		
		Store sy = new Store();
		personKim.purChase(sy,4000);
		personLee.purChase(sy,4500);
		
        personKim.showInfo();
        personLee.showInfo();
        
        sy.showInfo();
        
        
	}

}
