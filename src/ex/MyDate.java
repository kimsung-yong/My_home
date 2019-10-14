package ex;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		}
	
    public boolean isVaild() {
		boolean y = true;
		int i = this.day;
		if(i<1 || i>28) {
			y = false;    System.out.println("유효하지 않은 날짜 입니다");
		}
		    else {System.out.println("유효한 날짜 입니다");
		    }
    	return y; 
				
	}
	
	
}
