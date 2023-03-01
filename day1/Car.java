package week1.day1;

public class Car {
	
	public void driveCar()
	{
		System.out.println("The car is in Driving mode.");
	}
	public void applyBrake()
	{
		System.out.println("Check whether the Brake is working.");
	}
	public void soundHorn()
	{
		System.out.println("Sound Horn whenever needed.");
	}
	public void isPuncture()
	{
		System.out.println("Check whether the tyre is puncture.");
	}

	public static void main(String[] args) {
		Car obj1 = new Car();
		obj1.driveCar();
		obj1.applyBrake();
		obj1.soundHorn();
		obj1.isPuncture();

	}

}
