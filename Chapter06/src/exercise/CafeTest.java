package exercise;

public class CafeTest {

	public static void main(String[] args) {
		Person kim = new Person("±è ¾¾", 5000);
		Person lee = new Person("ÀÌ ¾¾", 10000);
		
		Cafe star = new Cafe("º°´Ù¹æ");
		Cafe been = new Cafe("Äá´Ù¹æ");
		
		kim.buyCoffee(star);
		lee.buyCoffee(been);
		
		kim.showInfo();
		lee.showInfo();
		
		star.showInfo();
		been.showInfo();
		
	}

}
