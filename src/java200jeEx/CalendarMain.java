package java200jeEx;

public class CalendarMain {

	public static void main(String[] args) {
		CalendarIn7 calendar = new CalendarIn7();
		int year= 2020;
		for(int i = 1; i<13;i++) {
			System.out.println("\t\t"+year+"��\t"+i+"��\n");
			calendar.printCalendar(year, i);
			System.out.println("\n---------------------------------------------------");
		}

	}

}
