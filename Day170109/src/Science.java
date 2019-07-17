
public class Science extends Book {

	public static final int FEE = 700;
	
	public Science(String isbn, String author, String publisher, String title) {
		super(isbn, author, publisher, title);
	}
	
	@Override
	public int getLateFees(int days) {
		// TODO Auto-generated method stub
		return days * FEE;
	}
	
}
