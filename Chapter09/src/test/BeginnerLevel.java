package test;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 걷습니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프못해");
	}

	@Override
	public void turn() {
		System.out.println("턴못해");
	}

	@Override
	public void levelMessage() {
		System.out.println("초급자--");
	}

}
