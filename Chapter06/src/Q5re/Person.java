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
			System.out.println(name + "님이 " + money + "원에 " + message);
			System.out.println("남은 돈은 " + this.money + "원 입니다.");
		}
	}
	
	public void buyBean(BeanCafe bean, int money) {
		String message = bean.brewing(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "원에 " + message);
			System.out.println("남은 돈은 " + this.money + "원 입니다.");
		}
	}
}
