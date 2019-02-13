package alone;

public class TwoDimensionAlone {

	public static void main(String[] args) {
		char[][] alphabets = new char[13][2];
		char sequenceChar = 'a';
		
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				alphabets[i][j] = sequenceChar++;
				System.out.print(alphabets[i][j] + " ");
			}
			System.out.println();
		}
	}

}
