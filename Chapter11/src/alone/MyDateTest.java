package alone;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate mDate = (MyDate)obj;
			if(mDate.day == this.day && mDate.month == this.month && mDate.year == this.year) {
				return true;
			}
			else {
				return false;
			}	
		}
		return false;
	}

	@Override
	public int hashCode() {
		return day * 10 + month * 101 + year * 102;
	}
	
	
	
}

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date1.hashCode());
		
		System.out.println(System.identityHashCode(date1));
		System.out.println(System.identityHashCode(date2));
		
	}

}
