package LibraryManagementSystem;

import java.util.Date;

public class Book {
	
	
	
	    private String title;
	    private String author;
	    private String isbn;
	    private Date publicationDate;
	    private boolean isAvailable;

	    public Book(String title, String author, String isbn, Date publicationDate) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.publicationDate = publicationDate;
	        this.isAvailable = true;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    public void setAvailable(boolean available) {
	        isAvailable = available;
	    }

	    @Override
	    public String toString() {
	        return title + " by " + author + " (ISBN: " + isbn + ")";
	    }
	}


