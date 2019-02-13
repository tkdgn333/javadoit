package test;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void levelMessage();
	
	public final void play(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
	
}
