package exercise;

public class MyDateTest2 {

	public static void main(String[] args) {
		MyDate2 date1 = new MyDate2(30, 2, 2000);
		System.out.println(date1.isValid());
		MyDate2 date2 = new MyDate2(2, 10, 2000);
		System.out.println(date2.isValid());
	}

}
