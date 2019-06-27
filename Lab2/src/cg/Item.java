package cg;

import java.util.Map;
import java.util.TreeMap;

public abstract class Item {
	
	Map<Integer,Item> map = new TreeMap<Integer, Item>();
	
	private int id;
	private String title;
	private int numberOfCopies;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String title, int numberOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", numberOfCopies=" + numberOfCopies + "]";
	}
	
	public void addItem(int id, Item i) {
		map.put(id, i);
	}
	
	public void CheckIn(Item i) {
		i.setNumberOfCopies(i.getNumberOfCopies() + 1);
	}
	
	public void checkOut(Item i) {
		i.setNumberOfCopies(i.getNumberOfCopies() - 1);
	} 
}
