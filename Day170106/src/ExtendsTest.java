
class SuperClass {
	
	protected int data = 100;
	
	public SuperClass(String name) {
		System.out.println("����Ŭ���� ������");
	}
	
	public void print() {
		System.out.println("����Ŭ������ print()" + data);
	}
	
}

class SubClass extends SuperClass {
	
	public int data = 200;
	
	public SubClass() {
		super("����Ŭ���� ����� ȣ��");
		System.out.println("����Ŭ���� ������");
	}
	
	public void print() {
		int data = 300;
		System.out.println("����Ŭ������ print()");
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
