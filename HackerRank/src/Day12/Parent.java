package Day12;

public class Parent {

	protected String firstName;
	protected String lastName;
	protected int id;
	
	Parent(String firstName, String lastName, int id) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;		
	}
	
	//Print person data
	public void printPerson() {
		
		System.out.println("Name : "+firstName+" "+lastName);
		System.out.println("Id : "+ id);	
		
	}
	
	
}
