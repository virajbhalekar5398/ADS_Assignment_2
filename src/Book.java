import java.util.Scanner;

public class Book {
	
    int id;
	String title;
    String author;
    String publisher;
    
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	 @Override
	public String toString()
	{
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher + "]";
	}
	
	public int compareTo(Book book) {
	     return (this.title).compareTo(book.title);
	   }
	Scanner sc = new Scanner(System.in);

    
    Book(int id,String title,String author,String publisher)
    {
    	this.id = id;
    	this.title = title;
    	this.author = author;
    	this.publisher = publisher;
    }
    void display_book () {
    	System.out.println("ID: "+ id);
    	System.out.println("Name: "+ title);
    	System.out.println("Author: "+ author);
    	System.out.println("Publisher: "+ publisher);
 
    }
    
};