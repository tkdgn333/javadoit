package reference;

public class Student3 {
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	
	
	public Student3() {
		korea = new Subject("����");
		math = new Subject("����");
	}
	
	public Student3(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject("����");
		math = new Subject("����");
	}
	
	public void setKorea(int score) {
		korea.setScorePoint(score);
	}
	public void setMath(int score) {
		math.setScorePoint(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScorePoint() + math.getScorePoint();
		System.out.println(studentName + " ������ " + total + "�� �Դϴ�.");
	}
}
