package ifexample;

public class SwitchCaseLonelyCoding {

	public static void main(String[] args) {
		int floor = 6;
		String ch = "";
		
		switch(floor) {
		case 1: ch = "약국";
				break;
		case 2: ch = "정형외과";
				break;
		case 3: ch = "피부과";
				break;
		case 4: ch = "치과";
				break;
		case 5: ch = "헬스 클럽";
				break;
		default: 
				System.out.println("존재하지 않는 층입니다.");
		}
		System.out.println(floor + "층 " + ch + "입니다.");
	}

}
