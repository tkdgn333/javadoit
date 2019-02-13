package classpart;

public class Man {
	int age;
	String name;
	boolean isMarried;
	int childrenNumber;
	
	public static void main(String[] args) {
		Man man1 = new Man();
		man1.age = 40;
		man1.name = "James";
		man1.isMarried = true;
		man1.childrenNumber = 3;
		
		System.out.println("나이 : " + man1.age + "살");
		System.out.println("이름 : " + man1.name);
		System.out.println("결혼여부 : " + man1.isMarried);
		System.out.println("자식 수 : " + man1.childrenNumber);
		
	}
}
