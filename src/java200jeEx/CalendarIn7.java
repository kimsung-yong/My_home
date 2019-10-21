package java200jeEx;

public class CalendarIn7 {
private int month[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31}; //���
private int lmonth[] = new int[] {31,29,31,30,31,30,3131,30,31,30,31}; //����
	
public boolean leapYearTF(int year) {
	boolean yearTF = false;
	if( (year % 4) == 0 && (year % 100) == 0 )
		return yearTF = true;
	else return yearTF = false;
	}
	// 1 ~ year ���� ���� Ƚ�� ���ϱ�
	public int howManyLeapYear(int year) {
		int count = 0;
		for(int i = 1; i < year; i++ ) {
			if(leapYearTF(i)) {
				count ++;
			}
			
		}
		return count;
	}
	//2005/9/25�� �̸� (2005/1/1~2005/8/31) �� �ϼ� + 25(9��)
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
	
	//���� ��¥�� 0-->�� 1-->�� 2-->ȭ 3-->�� 4-->�� 5-->�� 6-->��
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
		
		public int getDaytes(int year,int month) { // �״޿� ������ �ִ°�?
			if(leapYearTF(year)) {
				return this.lmonth[month-1]; //����
			}
			else return this.month[month-1]; //���
		}
		
		public void printCalendar(int year,int month) {
			int lineChek = 0; // ��¥�� ó�� ��� ��ġ�� �����ϴ� ����
			String temp = "";
			System.out.println("SUN\tMON\tTue\tWed\tThu\tFri\tSat");
			lineChek = startDayInCal(year,month); // 1���� ���� �����ΰ�?
			for(int j = 0; j < lineChek; j++) {
				temp +="\t"; //1���� �������̸� �� 3��(��,��,ȭ)
			}
			System.out.print(temp);
			int count = getDaytes(year,month);
			
			for(int i = 1; i<= count; i++) {
				System.out.print(i +"\t");
				lineChek++;
				if(lineChek == 7) {
					if(this.isLastDay(year, month, i)) {
						return ; // ���������� ������ �� �� �Ʒ� �����ʿ䰡 ����
					}
					System.out.println();
					lineChek=0;
				} //if
			}//for
		}//printCaledar
	

}
