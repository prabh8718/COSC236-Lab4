package lab4.library;

public class LibrarianController {
	private Library library;

	public LibrarianController(Library library) {
		this.library = library;
	}

	public void addBook(String title) {
		library.addBook(title);
	}

	public void addMember(String name) {
		library.addMember(name);
	}

	public void borrowBook(String bookName, String memberName) {
		Member member = library.findMemberByName(memberName);
		Book book = library.findBookByTitle(bookName);

		if (member == null) {
			System.out.println("Member " + memberName + " not found.");
			return;
		}

		if (book == null) {
			System.out.println(bookName + " does not exist in the catalog.");
			return;
		}

		if (member.borrowBook(book)) {
			System.out.println(memberName + " has successfully borrowed " + bookName);
		} else {
			System.out.println(bookName + " is either already borrowed or not available.");
		}
	}

	public void returnBook(String bookName, String memberName) {
		Member member = library.findMemberByName(memberName);
		Book book = library.findBookByTitle(bookName);

		if (member == null) {
			System.out.println("Member " + memberName + " not found.");
			return;
		}

		if (member.returnBook(book)) {
			System.out.println(memberName + " has successfully returned " + bookName);
		} else {
			System.out.println(memberName + " didn't borrow " + bookName);
		}
	}

	public void showAvailableBooks() {
		System.out.println("Available Books:");
		for (Book book : library.getCatalog()) {
			if (book.isAvailable()) {
				System.out.println(book.getTitle());
			}
		}
	}

	public void showMembers() {
		System.out.println("Library members:");
		for (Member member : library.getMembers()) {
			System.out.println(member.getName());
		}
	}
}
