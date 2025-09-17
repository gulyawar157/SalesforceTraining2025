package mynewpack;
import java.util.*;

class Student{
	private String name;
	private double gpa;
	
	Student( String name, double gpa ){
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}
}

public class C5_comparator_part2 {

	public static void main(String[] args) {
		ArrayList <Student> students = new ArrayList<>();
		students.add(new Student("Charlie", 3.5));
		students.add(new Student("Bob", 3.7));
		students.add(new Student("Alice", 3.5));
		students.add(new Student("John", 3.9));
		students.add(new Student("Tom", 4.1));
		
//      students.sort((o1, o2) -> {
// 	   if(o1.getGpa()>o2.getGpa()) {
// 		   return -1;
// 	   }
// 	   else if(o1.getGpa()<o2.getGpa()) {
// 		   return 1;
// 	   }
// 	   else {
// 		   return o1.getName().compareTo(o2.getName());
// 	   }
//    
//    });
		
		Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
//		students.sort(comparator);
				
		Collections.sort(students, comparator);
       for(Student s: students ) {
    	   System.out.println(s.getName() + " : " + s.getGpa());
       }
	}
}
