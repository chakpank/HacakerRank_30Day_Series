package Day13;

public abstract class Book {
	
	protected String title;
	protected String author;
	
	Book(String title, String author){
		
		this.title = title;
		this.author = author;
		
	}
	
	abstract void display();
	
	

}
