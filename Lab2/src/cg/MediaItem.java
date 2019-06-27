package cg;

public abstract class MediaItem extends Item {
	
	private int runTime;
	
	public MediaItem() {
		// TODO Auto-generated constructor stub
	}

	public MediaItem(int id, String title, int numberOfCopies, int runTime) {
		super(id, title, numberOfCopies);
		this.runTime = runTime;
		
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	@Override
	public String toString() {
		return "MediaItem [runTime=" + runTime + ", map=" + map + "]";
	}
	
	
	
}
