package classpart;

public class ShoppingOrder {
	long orderNumber;
	String orderID;
	String orderDate;
	String orderName;
	String orderProductNumber;
	String orderAddress;
	
	public static void main(String[] args) {
		ShoppingOrder order1 = new ShoppingOrder();
		order1.orderNumber = 201803120001L;
		order1.orderID = "abc123";
		order1.orderDate = "2018년 3월 12일";
		order1.orderName = "홍길순";
		order1.orderProductNumber = "PD0345-12";
		order1.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println(order1.orderNumber);
		System.out.println(order1.orderID);
		System.out.println(order1.orderDate);
		System.out.println(order1.orderName);
		System.out.println(order1.orderProductNumber);
		System.out.println(order1.orderAddress);
	}

}
