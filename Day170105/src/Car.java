
public class Car {
	
	int speed;
	int mileage;
	String color;
	
	public Car() {
		
	}
	
	public Car(int speed, int mileage, String color) {
		this.speed = speed;
		this.mileage = mileage;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", mileage=" + mileage + ", color=" + color + "]";
	}
	
}
