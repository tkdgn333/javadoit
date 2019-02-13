package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student3 studentJames = new Student3(100, "James");
		studentJames.setKorea(100);
		studentJames.setMath(100);
		
		Student3 studentTomas = new Student3(101, "Tomas");
		studentTomas.setKorea(80);
		studentTomas.setMath(60);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();

	}

}
