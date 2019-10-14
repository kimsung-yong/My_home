package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentJames = new Student("James",5000);
		Student studentThomas = new Student("thomas",10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2È£¼±");
		studentThomas.takeSubway(subwayGreen);
		studentThomas.showInfo();
		subwayGreen.showInfo();
	}

}
