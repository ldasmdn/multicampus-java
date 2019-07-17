
abstract class Shape {
	protected int x;
	protected int y;
	public abstract void draw();
}

class Rectangle extends Shape {
	public int width;
	private int height;
	public void draw() {
		System.out.println("Rectangle의 draw()");
	}
}

class Triangle extends Shape {
	private int base;
	private int height;
	public void draw() {
		System.out.println("Triangle의 draw()");
	}
}

class Circle extends Shape {
	private int radius;
	public void draw() {
		System.out.println("Circle의 draw()");
	}
}

class Cylinder extends Shape {
	public void draw() {
		System.out.println("Cylinder의 draw()");
	}
}

public class ShapeTest {
	
	private static Shape[] arrayOfShape;
	
	public static void main(String[] args) {
		
		init(); // 배열을 만들어서 객체를 담는다.
		drawAll(); // draw 메소드를 호출한다.
		
	}
	
	public static void init() {
		
		arrayOfShape = new Shape[4];
		arrayOfShape[0] = new Rectangle();
		arrayOfShape[1] = new Triangle();
		arrayOfShape[2] = new Circle();
		arrayOfShape[3] = new Cylinder();
		
	}
	
	public static void drawAll() {
		
		for(int i=0; i<arrayOfShape.length; i++) {
			arrayOfShape[i].draw();
		}
		
	}
	
	public static void calArea(Shape s) {
		
		// 왼쪽 참조변수가 참조하고 있는 객체가
		// 오른쪽 클래스를 통해 생성된 객체인지 검사하는 키워드
		if(s instanceof Rectangle) {
			((Rectangle) s).width = 10;
		}
	}
	
}
