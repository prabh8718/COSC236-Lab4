package lab4.library;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private String name;
	private List<Book> borrowedBooks;
	
	public Member(String name) {
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public boolean borrowBook(Book book) {
		if (book != null && book.isAvailable()) {
			book.setAvailable(false);
			borrowedBooks.add(book);
			return true;
		}
		return false;
	}

	public boolean returnBook(Book book) {
		if (borrowedBooks.contains(book)) {
			book.setAvailable(true);
			borrowedBooks.remove(book);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return name;
	}
}