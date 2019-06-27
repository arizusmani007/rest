package cg;

public class JournalPaper extends WrittenItem{
	
	private int yearPublished;
	
	public JournalPaper() {
		// TODO Auto-generated constructor stub
	}

	public JournalPaper(String author, int totalPages, String bookDepartment, int yearPublished) {
		super(author, totalPages, bookDepartment);
		this.setYearPublished(yearPublished);
		// TODO Auto-generated constructor stub
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", map=" + map + "]";
	}
	
	
	
}
