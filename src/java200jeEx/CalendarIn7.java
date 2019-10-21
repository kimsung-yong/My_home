package java200jeEx;

public class CalendarIn7 {
private int month[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31}; //평년
private int lmonth[] = new int[] {31,29,31,30,31,30,3131,30,31,30,31}; //윤년
	
public boolean leapYearTF(int year) {
	boolean yearTF = false;
	if( (year % 4) == 0 && (year % 100) == 0 )
		return yearTF = true;
	else return yearTF = false;
	}
	// 1 ~ year 까지 윤년 횟수 구하기
	public int howManyLeapYear(int year) {
		int count = 0;
		for(int i = 1; i < year; i++ ) {
			if(leapYearTF(i)) {
				count ++;
			}
			
		}
		return count;
	}
	//2005/9/25일 이면 (2005/1/1~2005/8/31) 총 일수 + 25(9월)
	public int howManyDaysinYearsMonth(int year,int month,int day) {
		int count = day;
		if(leapYearTF(year)) {
			for(int i =0; i<month;i++) {
				count += this.lmonth[i];
			}
			
		
		}
		else for(int i = 0; i < month; i++) {
			count += this.month[i];
			}
		return count;
	}
	
	//시작 날짜가 0-->일 1-->월 2-->화 3-->수 4-->목 5-->금 6-->토
	public int startDayInCal(int year,int month) {
		int count = 0;
		int leapYear = howManyLeapYear(year-1);
		int howManyDaysinYear = howManyDaysinYearsMonth(year,month,1);
		count = ((leapYear)*2+(year-1-leapYear)+howManyDaysinYear);
		return count%7;
	}
		public boolean isLastDay(int year,int month,int day) {
			boolean isL=false;
			if(leapYearTF(year)) {
				if(day==this.month[month-1]) {
					isL=true;
				}else {
					if(day==this.lmonth[month-1])
						isL=true;
				}
		}
			return isL;
		}
		
		public int getDaytes(int year,int month) { // 그달에 몇일이 있는가?
			if(leapYearTF(year)) {
				return this.lmonth[month-1]; //윤년
			}
			else return this.month[month-1]; //평년
		}
		
		public void printCalendar(int year,int month) {
			int lineChek = 0; // 날짜를 처음 찍는 위치를 지정하는 변수
			String temp = "";
			System.out.println("SUN\tMON\tTue\tWed\tThu\tFri\tSat");
			lineChek = startDayInCal(year,month); // 1일이 무슨 요일인가?
			for(int j = 0; j < lineChek; j++) {
				temp +="\t"; //1일이 수요일이면 탭 3개(일,월,화)
			}
			System.out.print(temp);
			int count = getDaytes(year,month);
			
			for(int i = 1; i<= count; i++) {
				System.out.print(i +"\t");
				lineChek++;
				if(lineChek == 7) {
					if(this.isLastDay(year, month, i)) {
						return ; // 마지막날이 끝나면 한 줄 아래 내릴필요가 없다
					}
					System.out.println();
					lineChek=0;
				} //if
			}//for
		}//printCaledar
	

}
