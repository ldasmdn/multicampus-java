
public abstract class Book {

	protected String isbn;
	protected String author;
	protected String publisher;
	protected String title;
	
	public Book(String isbn, String author, String publisher, String title) {
		this.isbn = isbn;
		this.author = author;
		this.publisher = publisher;
		this.title = title;
	}
	
	public abstract int getLateFees(int days);
	
	// equals �޼ҵ� ������
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			if(this.isbn.equals( ((Book) obj).isbn )) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
}
