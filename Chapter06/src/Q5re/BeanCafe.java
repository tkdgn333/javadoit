package Q5re;

public class BeanCafe {
	int money;
	
	public String brewing(int money) {
		this.money += money;
		
		if(money == Menu.BEAN_AMERICANO) {
			return "��ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		}
		else if(money == Menu.BEAN_LATTE) {
			return "��ٹ� �󶼸� �����߽��ϴ�.";
		}
		else {
			return null;
		}
	}
}
