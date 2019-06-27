package cg;

public class Book extends WrittenItem{
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String author, int totalPages, String bookDepartment) {
		super(author, totalPages, bookDepartment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [map=" + map + "]";
	}
	
	
}
