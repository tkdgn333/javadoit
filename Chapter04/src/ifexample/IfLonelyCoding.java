package ifexample;

public class IfLonelyCoding {

	public static void main(String[] args) {
		int score = 91;
		char grade;
		
		if(score >= 90) {
			grade = 'A';
			System.out.println("90�� �̻��Դϴ�.");
		}
		else if(score >= 80) {
			grade = 'B';
			System.out.println("80�� �̻��Դϴ�.");
		}
		else if(score >= 70) {
			grade = 'C';
			System.out.println("70�� �̻��Դϴ�.");
		}
		else if(score >= 60) {
			grade = 'D';
			System.out.println("60�� �̻��Դϴ�.");
		}
		else {
			grade = 'F';
			System.out.println("���");
		}
		System.out.println("������ " + grade + "�Դϴ�");
		
		
		
		
	}

}
