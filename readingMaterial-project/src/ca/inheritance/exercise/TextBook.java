package ca.inheritance.exercise;

public class TextBook extends ReadingMaterial{
	
	private String subject;
	private int editNumber;
	public final String DEFAULT_STRING = "Unknown";
	
	public TextBook(String title, int numOfPages, String subject, int editNumber) {
		super(title, numOfPages);
		setSubject(subject);
		setEditNumber(editNumber);
	}
	public String getSubject() {
		return subject;
	}
	
	public int getEditNumber() {
		return editNumber;
	}
	
	public void setSubject(String subject) {
		if (!subject.isEmpty() && !subject.equalsIgnoreCase(null)) {
			this.subject = subject;
		} else {
			this.subject = DEFAULT_STRING;
		}
	}
	
	public void setEditNumber(int editNumber) {
		if (editNumber > 0) {
			this.editNumber = editNumber;
		} else {
			this.editNumber = 1;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSubject : " + subject + "\nEdit Number : " + editNumber;
	}
	
}
