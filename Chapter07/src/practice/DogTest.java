package practice;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];
		
		for(int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
		}
		
		dogs[0] = new Dog("¸Û¸ÛÀÌ", "Ä¡¾Æ¿Í");
		dogs[1] = new Dog("»Ç»ß", "Áøµ¾°³");
		dogs[2] = new Dog("¼ø½ÉÀÌ", "»ð»ì°³");
		dogs[3] = new Dog("Ã¶ÀÌ", "¸¶¸£Æ¼½º");
		dogs[4] = new Dog("»ßÂÞ", "Çªµé");	
		
		/*
		dogs[0].setName("±¸¸§");
		dogs[0].setType("½ÃÃß");
		dogs[1].setName("°úÀÚ");
		dogs[1].setType("Æ÷¸Þ¶ó´Ï¾È");
		dogs[2].setName("ÄíÅ°");
		dogs[2].setType("Çªµé");
		dogs[3].setName("Á¡¹ÚÀÌ");
		dogs[3].setType("´Þ¸¶½Ã¾È");
		dogs[4].setName("°³³ð");
		dogs[4].setType("Ä¡¿Í¿Í");
		*/
		
		for(int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
	}

}
