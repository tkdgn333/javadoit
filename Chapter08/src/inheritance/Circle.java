package inheritance;

public class Circle{
	Point point; // has -a 관계 상속을 받지 않는 합성?
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
}
