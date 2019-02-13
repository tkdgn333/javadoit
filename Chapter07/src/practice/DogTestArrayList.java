package practice;
import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog("����", "ġ�Ϳ�"));
		dogList.add(new Dog("��Ű", "Ǫ��"));
		dogList.add(new Dog("�۸���", "������"));
		dogList.add(new Dog("�ػ���", "���޶�Ͼ�"));
		dogList.add(new Dog("�峭��", "��Ƽ��"));
		
		for(int i = 0; i < dogList.size(); i++) {
			System.out.println(dogList.get(i).showDogInfo());;
		}
		
		for(Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}
		
	}
}
