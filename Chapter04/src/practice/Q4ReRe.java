package practice;

public class Q4ReRe {

	public static void main(String[] args) {
		int lineNumber = 4;
		int starNumber = 1;
		int spaceNumber = lineNumber/2 + 1;
		
		for(int i = 0; i<lineNumber; i++) {
			for(int j = 0; j < spaceNumber; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < starNumber; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < spaceNumber; j++) {
				System.out.print(" ");
			}
			System.out.println();
			spaceNumber -= 1;
			starNumber += 2;
		}
	}

}
