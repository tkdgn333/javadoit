package practice;

public class Q3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int size = 0;
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if((i % 2) == 0) {
				arr[size] = i;
				size++;
			}
		}
		
		for(int num : arr) {
			System.out.println(num);
			sum += num;
		}
		System.out.println("1~10 Â¦¼öÀÇ ÃÑÇÕÀº " + sum);
	}

}
