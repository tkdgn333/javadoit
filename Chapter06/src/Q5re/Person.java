package Q5re;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	public void buyStar(StarCafe star, int money) {
		String message = star.brewing(4000);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "���� " + money + "���� " + message);
			System.out.println("���� ���� " + this.money + "�� �Դϴ�.");
		}
	}
	
	public void buyBean(BeanCafe bean, int money) {
		String message = bean.brewing(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "���� " + money + "���� " + message);
			System.out.println("���� ���� " + this.money + "�� �Դϴ�.");
		}
	}
}
