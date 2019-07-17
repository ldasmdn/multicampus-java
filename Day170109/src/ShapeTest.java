
abstract class Shape {
	protected int x;
	protected int y;
	public abstract void draw();
}

class Rectangle extends Shape {
	public int width;
	private int height;
	public void draw() {
		System.out.println("Rectangle�� draw()");
	}
}

class Triangle extends Shape {
	private int base;
	private int height;
	public void draw() {
		System.out.println("Triangle�� draw()");
	}
}

class Circle extends Shape {
	private int radius;
	public void draw() {
		System.out.println("Circle�� draw()");
	}
}

class Cylinder extends Shape {
	public void draw() {
		System.out.println("Cylinder�� draw()");
	}
}

public class ShapeTest {
	
	private static Shape[] arrayOfShape;
	
	public static void main(String[] args) {
		
		init(); // �迭�� ���� ��ü�� ��´�.
		drawAll(); // draw �޼ҵ带 ȣ���Ѵ�.
		
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
		
		// ���� ���������� �����ϰ� �ִ� ��ü��
		// ������ Ŭ������ ���� ������ ��ü���� �˻��ϴ� Ű����
		if(s instanceof Rectangle) {
			((Rectangle) s).width = 10;
		}
	}
	
}
