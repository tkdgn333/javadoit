package inheritance;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
		
/*	public Customer() {
		this.customerGrade = "SILVER"; //�⺻���
		this.bonusRatio = 0.01; //���ʽ� ����Ʈ �⺻ ���� ����
		System.out.println("Customer() ������ ȣ��"); //���� Ŭ���� ������ �� �ܼ� ��¹�
	} 
*/
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		System.out.println("Customer(int, String) ������ ȣ��");
	}
	
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio; //���ʽ� ����Ʈ ���
		return price;
	}

	public String showCustomerInfo() {
		return this.customerName + " ���� ����� " + this.customerGrade + " �̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
