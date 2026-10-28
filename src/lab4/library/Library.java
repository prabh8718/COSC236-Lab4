package lab4.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> catalog = new ArrayList<>();
	private List<Member> members = new ArrayList<>();

	public Book addBook(String title) {
		Book book = new Book(title);
		catalog.add(book);
		System.out.println(title + " has been added to the catalog.");
		return book;
	}

	public Member addMember(String name) {
		for (Member m : members) {
			if (m.getName().equalsIgnoreCase(name)) {
				System.out.println("Member " + name + " already exists.");
				return m;
			}
		}
		Member member = new Member(name);
		members.add(member);
		System.out.println("Member " + name + " has been added.");
		return member;
	}

	public Book findBookByTitle(String title) {
		for (Book book : catalog) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}
		return null;
	}

	public Member findMemberByName(String name) {
		for (Member member : members) {
			if (member.getName().equalsIgnoreCase(name)) {
				return member;
			}
		}
		return null;
	}

	public List<Book> getCatalog() {
		return catalog;
	}

	public List<Member> getMembers() {
		return members;
	}
}