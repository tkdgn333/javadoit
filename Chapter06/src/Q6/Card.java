package Q6;

public class Card {
	private static int serialNumber = 10000;
	private int cardNum;
	
	public Card() {
		serialNumber++;
		cardNum = serialNumber;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
}
