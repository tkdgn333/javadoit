package test;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("õõ�� �Ƚ��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("��������");
	}

	@Override
	public void turn() {
		System.out.println("�ϸ���");
	}

	@Override
	public void levelMessage() {
		System.out.println("�ʱ���--");
	}

}
