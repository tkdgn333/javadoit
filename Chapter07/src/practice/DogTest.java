package practice;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];
		
		for(int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
		}
		
		dogs[0] = new Dog("�۸���", "ġ�ƿ�");
		dogs[1] = new Dog("�ǻ�", "������");
		dogs[2] = new Dog("������", "��찳");
		dogs[3] = new Dog("ö��", "����Ƽ��");
		dogs[4] = new Dog("����", "Ǫ��");	
		
		/*
		dogs[0].setName("����");
		dogs[0].setType("����");
		dogs[1].setName("����");
		dogs[1].setType("���޶�Ͼ�");
		dogs[2].setName("��Ű");
		dogs[2].setType("Ǫ��");
		dogs[3].setName("������");
		dogs[3].setType("�޸��þ�");
		dogs[4].setName("����");
		dogs[4].setType("ġ�Ϳ�");
		*/
		
		for(int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
	}

}
