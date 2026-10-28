package lab4.library;
 
public class Book {
	private String title;
	private boolean isAvailable; 
	
	public Book(String title) {
		this.title = title;
		this.isAvailable = true; 
	}

	public String getTitle() {
		return title;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		this.isAvailable = available;
	}

	@Override
	public String toString() {
		return title + " [" + (isAvailable ? "Available" : "Borrowed") + "]";
	}
}
