package ifexample;

public class SwitchCaseLonelyCoding {

	public static void main(String[] args) {
		int floor = 6;
		String ch = "";
		
		switch(floor) {
		case 1: ch = "�౹";
				break;
		case 2: ch = "�����ܰ�";
				break;
		case 3: ch = "�Ǻΰ�";
				break;
		case 4: ch = "ġ��";
				break;
		case 5: ch = "�ｺ Ŭ��";
				break;
		default: 
				System.out.println("�������� �ʴ� ���Դϴ�.");
		}
		System.out.println(floor + "�� " + ch + "�Դϴ�.");
	}

}
