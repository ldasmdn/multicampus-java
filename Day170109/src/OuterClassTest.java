
class OuterClass {
	private String secret = "Time is Money";
	
	public void setSecret(String scret) {
		this.secret = secret;
	}
	
	// 인스턴스 멤버 클래스
	// OuterClass의 객체 내부에서 객체화됨
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
