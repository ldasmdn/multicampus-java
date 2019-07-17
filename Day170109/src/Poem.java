
public class Poem extends Book {

	public static final int FEE = 300;
	
	public Poem(String isbn, String author, String publisher, String title) {
		super(isbn, author, publisher, title);
	}
	
	@Override
	public int getLateFees(int days) {
		// TODO Auto-generated method stub
		return days * FEE;
	}

}
