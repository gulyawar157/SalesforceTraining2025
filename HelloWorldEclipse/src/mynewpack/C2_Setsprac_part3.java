package mynewpack;

import java.util.*;

public class C2_Setsprac_part3 {
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>();
		 set1.add("Ravi");    
         set1.add("Vijay");    
         set1.add("Arun");    
         set1.add("Sumit");    
         System.out.println("An initial list of elements: "+set1);    
         
         //Removing specific element from HashSet    
         set1.remove("Ravi");    
         System.out.println("After invoking remove(object) method: "+set1);    
         HashSet<String> set2 = new HashSet<String>();    
         set2.add("Ajay");    
         set2.add("Gaurav");    
         set1.addAll(set2);    
         System.out.println("Updated List: "+set1);    
         
         //Removing all the new elements from HashSet    
         set1.removeAll(set2);    
         System.out.println("After invoking removeAll() method: "+set1);    
         //Removing elements on the basis of specified condition    
         set1.removeIf(str->str.contains("Vijay"));      
         System.out.println("After invoking removeIf() method: "+set1);    
         //Removing all the elements available in the set    
         set1.clear();    
         System.out.println("After invoking clear() method: "+set1); 
         
         
         
         //Java HashSet from another Collection
         
         ArrayList<String> list=new ArrayList<String>();    
         list.add("Ravi");    
         list.add("Vijay");    
         list.add("Ajay");    
             
         HashSet<String> set3 = new HashSet<>(list);    
         set3.add("Gaurav");    
         Iterator<String> i=set3.iterator();    
         while(i.hasNext())    
         {    
         System.out.println(i.next());    
         }    
		
	}

}
