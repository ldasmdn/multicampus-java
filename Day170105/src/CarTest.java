
public class CarTest {
	public static void main(String[] args) {
		
		// Car 객체를 저장할 수 있는 참조변수 5개 생성
		Car[] car = new Car[5];
		
		car[0] = new Car(100, 300, "White");
		car[1] = new Car(110, 130, "Red");
		car[2] = new Car(90, 320, "Blue");
		car[3] = new Car(70, 330, "Yellow");
		car[4] = new Car(120, 430, "Black");
		
		for(int i=0; i<car.length; i++) {
			System.out.println(car[i]);
		}
		
	}
}
