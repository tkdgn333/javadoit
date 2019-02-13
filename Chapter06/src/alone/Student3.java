package alone;

public class Student3 {
	private static int serialNum = 1000;
	int studentCardNum;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student3() {
		serialNum++;
		studentID = serialNum;
		studentCardNum = serialNum + 100;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
	
}
