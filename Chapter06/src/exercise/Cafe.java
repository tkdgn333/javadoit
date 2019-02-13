package exercise;

public class Cafe {
	String cafeName;
	int money;
	int personNumber;
	
	public Cafe(String name){
		cafeName = name;
	}
	
	public void servCoffee(int money) {
		this.money += money;
		personNumber++;
	}
	
	public void showInfo() {
		System.out.println(cafeName + "지점의 매출액은 " + money + "원 이고, 받은 고객 수는 " + personNumber + "명 입니다.");
	}
}
