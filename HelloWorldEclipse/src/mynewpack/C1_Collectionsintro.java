package mynewpack;
import java.util.*;

public class C1_Collectionsintro {

	public static void main(String[] args) {
		   List<Integer> values = new ArrayList<>();
	        values.add(1);
	        values.add(2);
	        values.add(3);
	        values.add(4);
	        values.add(5);

	        //*Iterating using iterator */
	        System.out.println("Iterating using iterator");
	        Iterator<Integer> valuesIterator =  values.iterator();

	        while(valuesIterator.hasNext()){
	            int val = valuesIterator.next();
	            System.out.println(val);
	            if(val==2){
	                valuesIterator.remove();
	            }
	        }

	        //for each loop
	         System.out.println("Iterating using for each loop : ");
	        for (int i : values) {
	                System.out.println(i);            
	       }

	// for each method 
	  System.out.println("Iterating using for each method : ");
	    values.forEach((Integer val) -> System.out.println(val));

	}

}
