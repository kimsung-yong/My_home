package PracticeProblom;

public class PracticeProblomP197Q5_Person {
    String name;
	int money;
	
	public PracticeProblomP197Q5_Person() {
		
	}
	
	public PracticeProblomP197Q5_Person(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	public void purChase(Store store,int money) {
		this.money -= money;
		Store.sell(money);
		
	}
	
	public void showInfo() {
		System.out.println(name+"님의 현제 남은 금액은"+money+"입니다");
	}


}
