package alone;

import staticex.Student;

public class StudentTest6 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이상후");
		System.out.println("학번은 " + studentLee.studentID + ", 카드번호는 " + studentLee.studentCardNum);
		
		Student3 studentSon = new Student3();
		studentSon.setStudentName("손흥민");
		System.out.println("학번은 " + studentSon.studentID + ", 카드번호는 " + studentSon.studentCardNum);
	}

}
