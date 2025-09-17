package mynewpack;

import java.util.ArrayList;
import java.util.*;

public class C7_listpart2 {

	public static void main(String[] args) {
		// Creating an Array List
		List<Integer> list = new ArrayList<>();   //1. default constructor
		list.add(9);
		list.add(11);
		list.add(1, 10);
		List<Integer> list1 = new ArrayList<>(10);  // 2. with initial capacity
		 System.out.println(list1.getClass().getName());
		
		List<String> list2 = Arrays.asList("Mon", "Tue", "Wed");
		 System.out.println(list2.getClass().getName());
		
		
//		ArrayList<String> new_list = Arrays.asList("Mon", "Tue", "Wed");  // - wrong
		//error Type mismatch: cannot convert from List<String> to ArrayList<String>
		
		String[] str = {"hello", "ok", "Bye"};
		List<String> list3 = Arrays.asList(str);   
		// By this Arrays.asList we get nested  private static List which is of fixed size
		 System.out.println(list3.getClass().getName()); 
		 
	//	 list3.add("Please");  // gives error
		 list3.set(1, "Please");
		 
		 System.out.println(list3);
		
		
		 List<Integer> list4 =  List.of(4, 5 ,6, 16);  // unmodifiable also
		 System.out.println(list4);
		 
		// list4.set(1, 33);  // gives error 
		 
		 //Supose we have to add items in str3 
		 List<String> list5 = new ArrayList<>(list3); 
		 list5.add("Sure");
		 System.out.println(list5);
		 
		 
		 // *******************************************************
		 list.addAll(list4);
	//	 list4.addAll(list);   // not possible
		 System.out.println(list);
		 
		 List<String> list6 = new ArrayList<>(); 
		 list6.add("Apple");
		 list6.add("Apple");
		 list6.add("Papaya");
		 list6.add("Mango");
		 System.out.println(list6);
		 
		 list6.remove("Apple");
		 System.out.println(list6);
		 
		 list.remove(Integer.valueOf(11));
		 System.out.println(list);
		 
		 
		 //******************************************
//		 Object arr[] = list.toArray();
//		 String strarr[] = list6.toArray(new String[0]);
		 
		 Collections.sort(list);
		 
		 list6.sort(null);
		 System.out.println(list);
		 System.out.println(list6);
		 
		 
		 
		
		

	}

}
