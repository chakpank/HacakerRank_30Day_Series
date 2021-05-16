package Day13;

public class MyBook extends Book{
	
	int price;
	
	MyBook(String title, String author, int price){
		super(title, author);
		this.price = price;
		
	}
	
	@Override
	void display() {
		System.out.println("Book Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
		
	}
	

	public static void main(String[] args) {
		
		MyBook mb1 = new MyBook("The Alchemist", "Paulo Coelho", 248);
		MyBook mb2 = new MyBook("Harry Potter", "Chamber of Secrets", 250);
		mb1.display();
		System.out.println(" ");
		mb2.display();
	}



	

}
