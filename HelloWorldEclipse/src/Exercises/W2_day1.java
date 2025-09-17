package Exercises;

import java.util.*;

class Plan {
     private String title;
     private String desc;

   

	 Plan(String t, String d){
        this.title = t;
        this.desc = d;
     }

     public void settitle(String t){
           this.title = t;
     }

        public void setdesc(String d){
           this.desc = d;
     }

     public void gettitle(){
        System.out.println(title);
     }


       public void getdesc(){
        System.out.println(desc);
     }

    @Override
   	public String toString() {
   		return "Plan [title=" + title + ", desc=" + desc + "]";
   	}

   	 @Override
   	public int hashCode() {
   		return Objects.hash(title);
   	}

   	 @Override
   	 public boolean equals(Object obj) {
   		if (this == obj)
   			return true;
   		if (obj == null || getClass() != obj.getClass())
   			return false;
 
   		Plan other = (Plan) obj;
   		return Objects.equals(title, other.title);
   	 }

}

public class W2_day1 {

	public static void main(String[] args) {
	
		  List <Plan> list = new ArrayList<Plan>();
	        list.add(new Plan("Trip to Goa " , "Family Trip to Goa"));
	        list.add(new Plan("Workout Routine " , "GOing to gym at Evening"));
	        list.add(new Plan("Meeting with client " , "Having a meet with Mr. MK Taylor"));
	        list.add(new Plan("Trip to Goa " , "Trip with Friends"));
	        
	        System.out.println("All the Plans are : ");
	        
	        list.forEach(System.out :: println);
	        
	        System.out.println("Unique Plans are : ");
	        Set <Plan> newset = new HashSet<>();
	       
	        newset.addAll(list);
	        newset.forEach(System.out :: println);
	}

}
