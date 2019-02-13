package practice;

public class Q4Re {

	public static void main(String[] args) {
		int lineNumber = 4;
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
			starTimes += 2;
			spaceTimes -= 1;
			System.out.println();
		}
	}

}
