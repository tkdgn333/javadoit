package practice;

public class Q5Re2 {

	public static void main(String[] args) {
		int lineNumber = 9;
		int starTimes = 1;
		int spaceTimes = lineNumber/2 + 1;
		
		for(int i = 0; i < lineNumber; i++) {
			for( int j = 0; j < spaceTimes; j++) {
				System.out.print(" ");
			}
			for( int j = 0; j < starTimes; j++) {
				System.out.print("*");
			}
			for( int j = 0; j < spaceTimes; j++) {
				System.out.print(" ");
			}
			if(i < lineNumber/2) {
				starTimes += 2;
				spaceTimes -= 1;
				System.out.println();
			}
			else {
				starTimes -= 2;
				spaceTimes += 1;
				System.out.println();
			}
			
			
		}
	}

}
