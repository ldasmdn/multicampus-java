import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		// ArrayList<String> list = new ArrayList<String>();
		List<String> list = new LinkedList<String>();
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE"); // �ش� �ε����� ��Ҹ� �߰��ϰ� �ڷ� �� ĭ�� �о��.
		list.set(2, "GRAPE"); // �ش� �ε����� ��Ҹ� �����Ѵ�.
		list.remove(3);
		
		// result : MILK, APPLE, GRAPE
		Iterator e = list.iterator();
		while(e.hasNext()) {
			String s = (String) e.next();
			System.out.println(s);
		}
		
		
	}
}
