
public class ShopService {
	
	//--------------------------------------------------------
	// [�̱��� ����]
	//--------------------------------------------------------
	
	// 1. ���� �ϳ��� ��ü�� �����ϴ� �ڽ� Ÿ���� ����(static) ���������� �����Ѵ�.
	private static ShopService instance;
	
	// 2. ��ü ������ �����ϱ� ���� �����ڸ� private�� �����.
	private ShopService() {
		
	}
	
	// 3. ��ü�� ����� ���� Factory �޼ҵ带 �ۼ��Ѵ�.
	public static ShopService getInstance() {
		if(instance == null) { instance = new ShopService(); }
		return instance;
	}
	
}
