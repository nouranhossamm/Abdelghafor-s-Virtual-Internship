import java.util.Date;
import java.util.Scanner;

public class LibraryManagementSystemDemo {
	
	static Library library = new Library();
	static Scanner scan = new Scanner(System.in);
    static boolean running = true ;
	public static void main(String[] args) {
		
		
		
		
		library.addBook(new Book("1984", "George Orwell", "123456789", new Date()));
		library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "987654321", new Date()));
		
		library.registerMember(new Member("Alice", "M001", "alice@example.com"));
		
		
		
		while(running) {
			
			System.out.println("\nLibrary Management System");
            System.out.println("1. List Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scan.nextInt();
            scan.nextLine(); 
            
            switch(choice) {
                case 1:
                	listBooks();
                	break;	
                case 2:
                	borrowABook();
               		break;	
                 case 3:
                	 returnABook();
                	 break;
                 case 4:
                	 exit();
                	 break;
                default:
                	System.out.println("Invalid option. Please try again.");          
            }
		}
		scan.close();
	}
	
	
	public static void listBooks() {
		System.out.println("Available books:");
    	for(Book book : library.getBooks()) {
    		System.out.println(book);
    	}
	}
	
	
	public static void borrowABook() {
		System.out.print("Enter member ID to borrow a book: ");
    	String memberId = scan.nextLine();
    	
    	Member member = library.getMembers().stream()
    			.filter( m-> m.toString().contains(memberId))
    			.findFirst()
    			.orElse(null);
    	
    	if(member != null) {
    		System.out.print("Enter book title to borrow: ");
    		String title = scan.nextLine();
    		
    		Book borrowedBook = library.getBooks().stream()
    				.filter(b-> b.getTitle().equalsIgnoreCase(title) && b.isAvailable())
    				.findFirst()
    				.orElse(null);
    		
    		if(borrowedBook != null) {
    			library.borrowBook(borrowedBook, member);
    		}else {
    			System.out.println("Book not found or not available.");
    		}
    	}else {
    			 System.out.println("Member not found.");
    		}	
	}
	
	
	public static void returnABook() {
		System.out.print("Enter member ID to return a book: ");
		String memberId = scan.nextLine();
		
		Member member = library.getMembers().stream()
				.filter(m->m.toString().contains(memberId))
				.findFirst()
				.orElse(null);
		
		if(member != null) {
			System.out.print("Enter book title to return: ");
    		String title = scan.nextLine();
    		
    		Book returnedBook = library.getBooks().stream()
    				.filter(b-> b.getTitle().equalsIgnoreCase(title))
    				.findFirst()
    				.orElse(null);
    		
    		if (returnedBook != null) {
    			library.returnBook(returnedBook, member);
    		}else {
    			System.out.println("This book was not borrowed by the member.");
    		}
		}else {
			 System.out.println("Member not found.");
		}
		
	}
	
	public static void exit() {
		running = false ;
		System.out.println("Exiting the system....");
	}
	

}
