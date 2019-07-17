
public class BookTest {
	public static void main(String[] args) {
		
		Book[] arrayOfBook = new Book[3];
		arrayOfBook[0] = new Novel("1", "�Ҽ���", "�Ҽ�å ���ǻ�", "�Ҽ�");
		arrayOfBook[1] = new Poem("2", "����", "���� ���ǻ�", "��");
		arrayOfBook[2] = new Science("1", "����", "�������å ���ǻ�", "�������");
		
		/*
		for(int i=0; i<arrayOfBook.length; i++) {
			System.out.println( arrayOfBook[i].getLateFees(3) );
		}
		*/
		
		// System.out.println(arrayOfBook[0].equals(arrayOfBook[2]));
		
		for(Book b : arrayOfBook) {
			System.out.println(b.getLateFees(3));
		}
		
		Book bb = new Book("1", "�Ҽ���", "�Ҽ�å ���ǻ�", "�Ҽ�") {
			
			public static final int FEE = 350;
			
			@Override
			public int getLateFees(int days) {
				// TODO Auto-generated method stub
				return FEE * days;
			}
			
		};
	}
}
