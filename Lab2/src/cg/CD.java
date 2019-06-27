package cg;

public class CD extends MediaItem{
	
	private String artist;
	private String genre;
	
	public CD() {
		// TODO Auto-generated constructor stub
	}

	public CD(int id, String title, int numberOfCopies, int runTime, String artist, String genre) {
		super(id, title, numberOfCopies, runTime);
		this.artist = artist;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", map=" + map + "]";
	}
	
	
}
