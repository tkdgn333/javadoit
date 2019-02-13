package practice;

public class Q2RE {

	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan ++) {
			for(int times = 1; times <= 9; times++) {
				if(times <= dan) {
				System.out.println(dan + " x " + times + " = " + dan * times);
				}
			}
			System.out.println();
		}
	}

}
