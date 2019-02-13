package chapter2;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C';  //유니코드 '한' 16진수로 표현 (즉, 2바이트 표현)
		
		System.out.println(ch1);
		System.out.println(ch2);
	}

}
