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
		System.out.println(cafeName + "������ ������� " + money + "�� �̰�, ���� �� ���� " + personNumber + "�� �Դϴ�.");
	}
}
