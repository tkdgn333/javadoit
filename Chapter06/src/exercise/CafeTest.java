package exercise;

public class CafeTest {

	public static void main(String[] args) {
		Person kim = new Person("�� ��", 5000);
		Person lee = new Person("�� ��", 10000);
		
		Cafe star = new Cafe("���ٹ�");
		Cafe been = new Cafe("��ٹ�");
		
		kim.buyCoffee(star);
		lee.buyCoffee(been);
		
		kim.showInfo();
		lee.showInfo();
		
		star.showInfo();
		been.showInfo();
		
	}

}
