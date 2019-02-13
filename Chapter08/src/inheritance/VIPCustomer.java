package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
/*	public VIPCustomer() {
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
	}
*/
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price *bonusRatio;
		return price - (int)(price * saleRatio);
	}

}
