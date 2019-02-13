package alone;

public class Car {
	private int CarNum;
	private static int serialNum = 10000;

	public Car() {
		serialNum++;
		CarNum = serialNum;
	}
	
	public int getCarNum() {
		return CarNum;
	}

	public void setCarNum(int carNum) {
		this.CarNum = carNum;
	}
	
	
}
