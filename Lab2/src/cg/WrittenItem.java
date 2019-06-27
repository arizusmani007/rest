package cg;

public abstract class WrittenItem extends Item {
	
	private String author;
	private int totalPages;
	private String bookDepartment;
	
	public WrittenItem() {
		// TODO Auto-generated constructor stub
	}

	public WrittenItem(String author, int totalPages, String bookDepartment) {
		super();
		this.author = author;
		this.totalPages = totalPages;
		this.bookDepartment = bookDepartment;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public String getBookDepartment() {
		return bookDepartment;
	}

	public void setBookDepartment(String bookDepartment) {
		this.bookDepartment = bookDepartment;
	}

	@Override
	public String toString() {
		return super.toString() + "WrittenItem [author=" + author + ", totalPages=" + totalPages + ", bookDepartment=" + bookDepartment
				+ "]";
	}
	
	
	
	

}
