package array;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		
		for(int i = 0; i < arr.length; i++) {  // arr.length : ��
			for(int j = 0; j < arr[i].length; j++) { // arr[i].length : ��
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
