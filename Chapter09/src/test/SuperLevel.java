package test;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("���� ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("�� ���� �����մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�ѹ��� ���ϴ�.");
	}

	@Override
	public void levelMessage() {
		System.out.println("�����--");
	}

}
