package cooperation;

public class Taxi {
	String TaxiName;
	int passengerCount;
	int money;
	
	public Taxi(String TaxiName) {
		this.TaxiName = TaxiName;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(TaxiName + "�� �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
}
