package test;

import hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "�̻��";
		studentLee.setStudentName("�̻��");
		studentLee.address = "���� ��õ��";
		
		System.out.println(studentLee.getStudentName());
	
	}
}
