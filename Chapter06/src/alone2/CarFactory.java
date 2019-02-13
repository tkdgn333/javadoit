package alone2;

public class CarFactory {
	private static CarFactory carFactory = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(carFactory == null) {
			carFactory = new CarFactory();
		}
		return carFactory;
	}
	
	public Car createCar() {
		return new Car();
	}
}
