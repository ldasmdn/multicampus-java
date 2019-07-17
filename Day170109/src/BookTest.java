
public class BookTest {
	public static void main(String[] args) {
		
		Book[] arrayOfBook = new Book[3];
		arrayOfBook[0] = new Novel("1", "소설가", "소설책 출판사", "소설");
		arrayOfBook[1] = new Poem("2", "시인", "시집 출판사", "시");
		arrayOfBook[2] = new Science("1", "공상가", "공상과학책 출판사", "공상과학");
		
		/*
		for(int i=0; i<arrayOfBook.length; i++) {
			System.out.println( arrayOfBook[i].getLateFees(3) );
		}
		*/
		
		// System.out.println(arrayOfBook[0].equals(arrayOfBook[2]));
		
		for(Book b : arrayOfBook) {
			System.out.println(b.getLateFees(3));
		}
		
		Book bb = new Book("1", "소설가", "소설책 출판사", "소설") {
			
			public static final int FEE = 350;
			
			@Override
			public int getLateFees(int days) {
				// TODO Auto-generated method stub
				return FEE * days;
			}
			
		};
	}
}
