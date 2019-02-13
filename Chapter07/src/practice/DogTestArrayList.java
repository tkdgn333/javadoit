package practice;
import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog("구름", "치와와"));
		dogList.add(new Dog("쿠키", "푸들"));
		dogList.add(new Dog("멍멍이", "진돗개"));
		dogList.add(new Dog("솜사탕", "포메라니안"));
		dogList.add(new Dog("장난감", "말티즈"));
		
		for(int i = 0; i < dogList.size(); i++) {
			System.out.println(dogList.get(i).showDogInfo());;
		}
		
		for(Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}
		
	}
}
