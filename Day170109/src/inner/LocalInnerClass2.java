package inner;

class OuterClass {
	int out_value = 100;
	public OuterClass() {
		System.out.println("외부클래스 생성자");
	}
	public void chkExec() {
		System.out.println("내부클래스에서 호출하기 위한 메소드");
	}
	public void outExec(int param1, final int param2) {
		int local_value1 = 200;
		final int local_value2 = 300;
		class InnerClass {
			int in_value = 600;
			public InnerClass() {
				System.out.println("내부클래스 생성자");
			}
			public void inExec() {
				chkExec();
				System.out.println("out_value : " + out_value);
				// final이 붙어있지 않은 파라미터는 지역 클래스에서 사용할 수 없다.
				// System.out.println("param1 : " + param1);
				System.out.println("param2 : " + param2);
				// final이 붙어있지 않은 지역 변수는 지역클래스에서 사용할 수 없다.
				// System.out.println("local_value1 : " + local_value1);
				System.out.println("local_value2 : " + local_value2);
				System.out.println("in_value : " + in_value);
			}
		}
		InnerClass inner = new InnerClass();
		inner.inExec();
	}
}

public class LocalInnerClass2 {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.outExec(400, 500);
	}
}
