package ca.inheritance.exercise;

public class ReadingMaterial {
	
	private String title;
	private int numOfPages;
	public final String DEFAULT_STRING = "Unknown";
	
	
	public ReadingMaterial(String title, int numOfPages) {
		setTitle(title);
		setNumOfPages(numOfPages);
	}


	public String getTitle() {
		return title;
	}
	
	public int getNumOfPages() {
		return numOfPages;
	}
	
	public void setTitle(String title) {
		if (!title.isEmpty() && !title.equalsIgnoreCase(null)) {
			this.title = title;
		} else {
			this.title = DEFAULT_STRING;
		}
	}
	
	public void setNumOfPages(int numOfPages) {
		if(numOfPages > 0) {
			this.numOfPages = numOfPages;
		} else {
			this.numOfPages = numOfPages;
		}
	}
	
	@Override
	public String toString() {
		return "Title : " + getTitle() + "\nNumber of pages : " 
				+ getNumOfPages();
	}
	
	
	

	
}
