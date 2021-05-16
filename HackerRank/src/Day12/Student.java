package Day12;

public class Student extends Parent {

	private int[] arr;

	Student(String firstName, String lastName, int id, int [] arr) {
		super(firstName, lastName, id);
		this.arr = arr;
		
	}
	
	public  char calcGrade(int [] arr) {
		
		int total_marks = 0; 
		
		char grade = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			total_marks = total_marks+arr[i];
		}
		
		int avg_mark = (int)(total_marks/arr.length);
		
		if(avg_mark > 90) {
			
			grade = 'O';
			return grade;
			
		}else if (avg_mark < 90 && avg_mark> 75) {
			grade = 'A';
			return grade;
			
		}else if (avg_mark < 75 && avg_mark> 60) {
			grade = 'B';
			return grade;
			
		}else if (avg_mark < 60 ) {
			grade = 'C';
			return grade;
			
		}
		
		return grade;

		
}
	

	public static void main(String[] args) {
		int [] arr = {30,78};
		Student s1 = new Student("Pankaj", "Chakraborty", 1, arr);
		System.out.println(s1.firstName+" achived Grade : "+ s1.calcGrade(arr));				

	}

}
