package exercise;

public class CardCompany {
	private static CardCompany cardCompany = new CardCompany();
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(cardCompany == null) {
			cardCompany = new CardCompany();
		}
		return cardCompany;
	}
	
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
