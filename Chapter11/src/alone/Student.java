package alone;

public class Student {
	String studentName;
	int studentNumber;
	
	public Student(String studentName, int studentNumber) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "�л� �̸� : " + studentName + "\n�й� : " + studentNumber;  
	}
	
	
	
	
}
