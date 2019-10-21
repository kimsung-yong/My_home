package object;

class MyDate{
	int day;
	int month;
	int year;
	public MyDate() {
		
	}
	
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	public int hashCode() {
		return month;
		
	} 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			if(this.day == date.day && this.month == date.month && this.year == date.year)
				return true;
			else return false;
		}
		else return false;
		
	}
}

public class MyDateTest {
	public static void main(String[] argvs) {
		MyDate date = new MyDate(15,3,2019);
		MyDate date1 = new MyDate(15,4,2019);
		
		System.out.println(date.hashCode());
		System.out.println(date1.hashCode());
		
		System.out.println(date.equals(date1));
	}
}
