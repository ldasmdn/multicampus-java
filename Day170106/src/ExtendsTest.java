
class SuperClass {
	
	protected int data = 100;
	
	public SuperClass(String name) {
		System.out.println("상위클래스 생성자");
	}
	
	public void print() {
		System.out.println("상위클래스의 print()" + data);
	}
	
}

class SubClass extends SuperClass {
	
	public int data = 200;
	
	public SubClass() {
		super("상위클래스 명시적 호출");
		System.out.println("하위클래스 생성자");
	}
	
	public void print() {
		int data = 300;
		System.out.println("하위클래스의 print()");
		System.out.println(data);
		System.out.println(this.data);
		// System.out.println(super.data);
		super.print();
	}
	
}

public class ExtendsTest {
	public static void main(String[] args) {
		// new SubClass().print();
		SuperClass sClass = new SubClass();
	}
}
