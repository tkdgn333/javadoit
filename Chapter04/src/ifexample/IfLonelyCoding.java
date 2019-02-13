package ifexample;

public class IfLonelyCoding {

	public static void main(String[] args) {
		int score = 91;
		char grade;
		
		if(score >= 90) {
			grade = 'A';
			System.out.println("90점 이상입니다.");
		}
		else if(score >= 80) {
			grade = 'B';
			System.out.println("80점 이상입니다.");
		}
		else if(score >= 70) {
			grade = 'C';
			System.out.println("70점 이상입니다.");
		}
		else if(score >= 60) {
			grade = 'D';
			System.out.println("60점 이상입니다.");
		}
		else {
			grade = 'F';
			System.out.println("노답");
		}
		System.out.println("학점은 " + grade + "입니다");
		
		
		
		
	}

}
