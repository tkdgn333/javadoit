package test;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴못해");
	}

	@Override
	public void levelMessage() {
		System.out.println("중급자--");
	}

}
