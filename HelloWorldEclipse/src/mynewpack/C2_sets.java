package mynewpack;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
public class C2_sets {

	public static void main(String[] args) {
		   //*  Based on principle  of HashMap . Tc -Insertion, Deletion, Find -- O(1) ---> faster operations  */
		// Internal working similar to hashmap. In place of value it has dummy value
        //TreeSet (based on a Red-Black Tree, a self-balancing binary search tree)  -- O(log n )

        // Map -- HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set -- HashSet, LinkedHashSet, TreeSet, EnumSet
       
       Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(1);
        System.out.println(set);
      
        System.out.println(set.contains(11));
         System.out.println(set.remove(2));

         for(int i : set){
           System.out.println(i);
         }
          set.clear();
          System.out.println(set.isEmpty());


          Set<String> h = new HashSet<String>();

       // Adding elements to Set using add() method, Custom input elements 
       h.add("A");
       h.add("B");
       h.add("C");
       h.add("B");
       h.add("D");
       h.add("E");

       // Iterating through the Set via for-each loop 
       for (String value : h){
           // Printing all the values inside the object 
           System.out.print(value + ", ");
       }


       // Set<Integer> set3 = new LinkedHashSet<>();
       //  set3.add(5);
       //  set3.add(2);
       //  set3.add(3);
       //  set3.add(3);
       //  set3.add(1);
       //  System.out.println(set3);
      
       // Set<Integer> set2 = new TreeSet<>();
       //  set2.add(5);
       //  set2.add(2);
       //  set2.add(3);
       //  set2.add(3);
       //  set2.add(1);
       //  System.out.println(set2);

       // for thread safety 
       // Set<Integer> integers = Collections.synchronizedSet(set);  --- operations will be complex 
       // All methods are wrap into synchronized.   performance will be compromised, so we use

       Set<Integer> set4 = new ConcurrentSkipListSet<>();  //stores sorted element and used in         range -based information, skiplist data structure is used

       //unmodifiable
       Set <Integer> newset = Set.of(1,2,3,4,5,6,7,8,9,10, 11, 12);  // Can have more than 10 values

       Collections.unmodifiableSet(newset);  //newset becomes immutable

   NavigableSet<Integer> newset2 = new TreeSet<>();
   SortedSet<Integer> newset3 = new TreeSet<>();



	}

}
