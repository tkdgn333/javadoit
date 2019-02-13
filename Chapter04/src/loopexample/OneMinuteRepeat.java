package loopexample;

public class OneMinuteRepeat {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 1; /*sum<500*/; num++) {
			sum += num;
			if(sum > 500)
				break; 
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
