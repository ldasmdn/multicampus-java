
class OuterClass {
	private String secret = "Time is Money";
	
	public void setSecret(String scret) {
		this.secret = secret;
	}
	
	// �ν��Ͻ� ��� Ŭ����
	// OuterClass�� ��ü ���ο��� ��üȭ��
	class InnerClass {
		public void method() {
			System.out.println("Inner Class");
		}
	}
}

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass outer2 = new OuterClass();
		outer.setSecret("Time is not Money");
		
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.method();
	}
}
