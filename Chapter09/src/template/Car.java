package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("½Ãµ¿À» ÄÕ´Ï´Ù.");
	}
	public void turnOff() {
		System.out.println("½Ãµ¿À» ²ü´Ï´Ù.");
	}
	
	final public void run() { //ÅÆÇÃ¸´ ¸Þ¼­µå
		startCar();
		drive();
		stop();
		turnOff();
	}
}
