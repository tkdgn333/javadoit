package Q6;

public class CardCompanyTest {
	public static void main(String[] args) {
		CardCompany cardCompany = new CardCompany();
		Card card = cardCompany.createCard();
		Card card2 = cardCompany.createCard();
		
		System.out.println(card.getCardNum());
		System.out.println(card2.getCardNum());
	}
}
