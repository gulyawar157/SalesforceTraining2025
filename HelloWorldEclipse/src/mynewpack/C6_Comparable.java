package mynewpack;

import java.util.*;

class Student2 implements Comparable<Student2>{
	private String name;
	private double gpa;
	
	Student2( String name, double gpa ){
		this.name = name;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", gpa=" + gpa + "]";
	}

	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public int compareTo(Student2 o) {
	    System.out.println("Comparing: " + this.name + " with " + o.name);
		return Double.compare(this.getGpa() ,o.getGpa());
	}
}
public class C6_Comparable {

	public static void main(String[] args) {
//		List <Student> list1 = new ArrayList<>();
//		list1.add(new Student("Charlie", 3.5));
//		list1.add(new Student("Bob", 3.7));
//		list1.add(new Student("Alice", 3.5));
//		
//		list1.sort(null);   // This will give error because we dont have tell how to sort 
//		 System.out.println(list1);   
		 
		// This will work fine because list is of Integer Type Objects
			List<Integer> numbers = new ArrayList<>();
		    numbers.add(9);
		    numbers.add(4);
		    numbers.add(45);
		
		    numbers.sort(null);
		    System.out.println(numbers);
		    
		    
			List <Student2> list2 = new ArrayList<>();
			list2.add(new Student2("Charlie", 4.3));
			list2.add(new Student2("Bob", 3.9));
			list2.add(new Student2("Alice", 3.8));
			list2.add(new Student2("John", 3.0));
			list2.add(new Student2("Tom", 3.1));
			
		    list2.sort(null);
		    System.out.println(list2);
		   
		       
			
			

	}

}
