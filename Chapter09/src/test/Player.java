package test;

public class Player {
	PlayerLevel level;
	
	public Player(){
		level = new BeginnerLevel();
		level.levelMessage();
	}
	
	public void play(int count) {
		level.play(count);
	}
	
	public void upgradeLevel(PlayerLevel playerLevel) {
		this.level = playerLevel;
		this.level.levelMessage();
	}
}
