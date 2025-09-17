package mynewpack;

import java.util.*;
public class C3_SortinginCollections {

	public static void main(String[] args) {
		
   //Sorting Collections in Java
	// In Java, sorting can be done using Collections Framework utilities and arrays.
	//	The main APIs are:
	//	Collections.sort() → For lists.
	//	Arrays.sort() → For arrays.
	//	Using Comparable and Comparator → For custom sorting.
		
		
		// to sort string objects and in sorting in reverse order 
		
		   List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));

	        Collections.sort(list); // natural order
	        System.out.println(list);

	        Collections.sort(list, Collections.reverseOrder()); 
	        System.out.println(list); 
	        
	        int[] arr = {5, 2, 9, 1, 7};
	        Arrays.sort(arr); 
	        System.out.println(Arrays.toString(arr)); // [1, 2, 5, 7, 9]

	        String[] names = {"John", "Alice", "Bob"};
	        Arrays.sort(names);
	        System.out.println(Arrays.toString(names));
	        
	        // To sort Wrapper class object
	        ArrayList <Integer> al= new ArrayList<>();  
	        al.add(Integer.valueOf(201));  
	        al.add(Integer.valueOf(101));  
	        al.add(230);//internally will be converted into objects as Integer.valueOf(230)  
	        Collections.sort(al);  
	          
	        Iterator<Integer> itr=al.iterator();  
	        while(itr.hasNext()){  
	        System.out.println(itr.next());  
	         } 
	        
	        //  To sort user-defined class objects
	        
	        
	        
	}
}
