package test;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("제일 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("더 높게 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 돕니다.");
	}

	@Override
	public void levelMessage() {
		System.out.println("고급자--");
	}

}
