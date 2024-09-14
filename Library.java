import java.util.ArrayList;
import java.util.List;

public class Library {
	
	
	private List<Book> books;
	private List<Member> members;
	
    public Library() {
    	
    	books = new ArrayList<>();
    	members = new ArrayList<>();
    }
    
    public void addBook (Book book) {
    	
    	books.add(book);
    	//System.out.println("Added: " + book);
    }
    
    public void removeBook (Book book) {
    	
    	books.remove(book);
    	System.out.println("Removed: " + book);
}
    
    public void registerMember(Member member) {
    	members.add(member);
    	//System.out.println("Registered: " + member);
    }
    
    
    public void borrowBook(Book book , Member member) {
    	
    	if (book.isAvailable()) {
    		member.borrowBook(book);
    		System.out.println(member + " borrowed " + book);
    	}else {
    		System.out.println(book + " is not available.");
    	}
    		
    }
    
    
    public void returnBook(Book book , Member member) {
    	
    	if(member.getBorrowedBooks().contains(book)) {
    		member.returnBook(book);
    		System.out.println(member + " returned " + book);
    	}else {
    		System.out.println(member + " has not borrowed " + book);
    	}	
    }
    
    
    public List<Book> getBooks() {
    	
        return books;
    }
    

    public List<Member> getMembers() {
    	
        return members;
    }
    
    
}



