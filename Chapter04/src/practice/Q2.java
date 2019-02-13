package practice;

public class Q2 {

	/**
	 * 구구단을 짝수 단만 출력하도록 프로그램을 만들어보세요.
	 */
	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) {
			if(dan%2 == 1) continue;
			for(times=1; times<=9; times++) {
				System.out.println(dan + " X " + times + " = " + (dan * times));
			}
			System.out.println();
		}
		
	}

}
 