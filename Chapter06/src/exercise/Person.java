package exercise;

public class Person {
	String personName;
	int money;
	
	public Person(String name, int money){
		personName = name;
		this.money = money;
	}
	
	public void buyCoffee(Cafe cafe){
		if(cafe.cafeName == "���ٹ�") {
			cafe.servCoffee(4000);
			money -= 4000;
		}
		else if(cafe.cafeName == "��ٹ�") {
			cafe.servCoffee(4500);
			money -= 4500;
		}
	}

	public void showInfo() {
		System.out.println(personName + "���� ���� ����" + money + "�� �Դϴ�.");
	}
}
