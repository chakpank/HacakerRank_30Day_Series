package Day4;

public class Person {
	
	int age;
	
	Person(int initialAge){
		
		if(initialAge < 0) {
			this.age = 0;
			System.out.println("Age is not valid. Setting the age to 0");
			System.out.println(" ");
		}else {
			this.age = initialAge;
		}
		
	}
	
	public int yearPasses() {
		int retAge;
		
		retAge = this.age + 1;
		return retAge;
		
	}
	
	public void amIOld() {
		if(this.age < 13) {
			System.out.println("You are young.");
		}else if (this.age >= 13 && this.age<18) {
			System.out.println("You are a teen ager.");
		}else {
			System.out.println("You are old");
		}
	}

}
