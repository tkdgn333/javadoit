package Q5re;

public class StarCafe {
	int money;
	
	public String brewing(int money) {
		this.money += money;
		
		if(money == Menu.STAR_AMERICANO) {
			return "���ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		}
		else if(money == Menu.STAR_LATTE) {
			return "���ٹ� �󶼸� �����߽��ϴ�.";
		}
		else {
			return null;
		}
	}
}
