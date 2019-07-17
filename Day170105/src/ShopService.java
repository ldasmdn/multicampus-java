
public class ShopService {
	
	//--------------------------------------------------------
	// [싱글턴 패턴]
	//--------------------------------------------------------
	
	// 1. 오직 하나의 객체를 저장하는 자신 타입의 정적(static) 참조변수를 선언한다.
	private static ShopService instance;
	
	// 2. 객체 생성을 제한하기 위해 생성자를 private로 감춘다.
	private ShopService() {
		
	}
	
	// 3. 객체를 만들기 위한 Factory 메소드를 작성한다.
	public static ShopService getInstance() {
		if(instance == null) { instance = new ShopService(); }
		return instance;
	}
	
}
