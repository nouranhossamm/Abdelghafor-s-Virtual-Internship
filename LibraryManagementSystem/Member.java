package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Member {

	
		private String name ;
		private String membershipId;
		private String contactInfo ;
		private List<Book> borrowedBooks;
		
		public Member(String name , String membershipId , String contactInfo) {
			
			this.name=name;
			this.membershipId=membershipId;
			this.contactInfo=contactInfo;
			this.borrowedBooks=new ArrayList<>();
			
		}
		
		
		public void borrowBook(Book book) {
			
			borrowedBooks.add(book);
			book.setAvailable(false);
			
		}
		
		
		public void returnBook(Book book) {
			
			borrowedBooks.remove(book);
			book.setAvailable(true);
			
		}
		
		
		public List<Book> getBorrowedBooks(){
			
			return borrowedBooks;
		}
		
		@Override
		public String toString() {
			return name + "(ID : " + membershipId + ")" ;
		}
		
		

	}


