package Library_ManagementAPP;

public class Books {
	
	private int bookid;
	private String bookName;
	private String bookAuthor;
	private String bookStatus;
	
	//create the constructor 
	public Books(int bookid, String bookName, String bookAuthor, String bookStatus) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookStatus = bookStatus;
	}

	public Books(String bookName, String bookAuthor, String bookStatus) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookStatus = bookStatus;
	}

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookStatus="
				+ bookStatus + "]";
	}
	
	// insert toString method;
	
	
	
	

}
