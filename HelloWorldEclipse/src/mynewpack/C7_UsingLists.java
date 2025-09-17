package mynewpack;

import java.util.*;

public class C7_UsingLists {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(15);
		
//		 System.out.println(list.get(0));
//		 System.out.println(list.get(3));
//		 System.out.println(list.size());
		 
//		 for(int i = 0; i<list.size();i++) {
//			 System.out.println(list.get(i));
//		 }
//		 
		
		 System.out.println(list.contains(30));
		 System.out.println(list.contains(15));
		 
		 list.remove(2);
		 list.add(1, 33);  // add at particular index
		 
		 for(int x : list) {
			 System.out.println(x);
		 }
		 
		 list.set(0, 3);   // replace at particular index
		 
		 
		 System.out.println(list); // it runs to string method
		 
		 ArrayList<Integer> list2 = new ArrayList<>(1000);
//		 System.out.println(list2.size()); // it gives 0 because we have defined capacity not insertion
//	 System.out.println(list2.get(0));    it gives error because  no element is inserted
		 
		 list.trimToSize();   // automatically shrink-- it shrink capacity --capacity = size
		 // using reflections we can see capacity


	}

}
