package Q5re;

public class Test {

	public static void main(String[] args) {
		Person kim = new Person("�达", 10000);
		Person Lee = new Person("�̾�", 15000);
		
		StarCafe star = new StarCafe();
		BeanCafe bean = new BeanCafe();
		
		kim.buyStar(star, 4000);
		kim.buyBean(bean, 4500);
		Lee.buyBean(bean, 4500);
	}

}
