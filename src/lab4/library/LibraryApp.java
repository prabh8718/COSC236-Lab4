package lab4.library;

public class LibraryApp {
  public static void main(String[] args) {
	 Library library = new Library();
	 LibrarianController controller = new LibrarianController(library);

	 System.out.println(" *** Library management system demo *** ");
	 
	System.out.println("\n *** Adding \"Dune\" to the library:");
	controller.addBook("Dune");
	
	System.out.println("\n *** Adding \"1984\" to the library:");
	controller.addBook("1984"); 
	
	System.out.println("\n *** Adding \"Moby Dick\" to the library:");
    controller.addBook("Moby Dick");

    System.out.println("\n *** Show all books:");
    controller.showAvailableBooks();
    
    System.out.println("\n *** Adding \"Alice\" to the library members");
    controller.addMember("Alice");
    
    System.out.println("\n *** Adding \"Bob\" to the library members");
    controller.addMember("Bob");

    System.out.println("\n *** Show all members");
    controller.showMembers();
    
    System.out.println("\n *** Alice borrows Dune:");
    controller.borrowBook("Dune", "Alice");

    System.out.println("\n *** Show all books:");
    controller.showAvailableBooks();

    System.out.println("\n *** Bob borrows 1984:");
    controller.borrowBook("1984", "Bob");
    
    System.out.println("\n *** Show all books:");
    controller.showAvailableBooks();
    
    System.out.println("\nBob borrows Dune:");
    controller.borrowBook("Dune", "Bob");
    
    System.out.println("\n *** Show all books:");
    controller.showAvailableBooks();
    
    System.out.println("\n *** Alice returns Dune:");
    controller.returnBook("Dune", "Alice");

    System.out.println("\n *** Show all books:");
    controller.showAvailableBooks();

    System.out.println("\n *** Bob borrows Dune:") ;
    controller.borrowBook("Dune", "Bob");
    
    System.out.println("\n *** Show all books:");
    controller.showAvailableBooks();
	}
}