package exercise;

public class Card {
	
	private int cardNumber;
	private static int serialNum = 10000;
	
	public Card() {
		serialNum++;
		cardNumber = serialNum;
	}

	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNum) {
		cardNumber = cardNum;
	}
	
	
	
}
