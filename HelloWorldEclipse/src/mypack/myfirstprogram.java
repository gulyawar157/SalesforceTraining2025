package mypack;

// list to array in Java 
// Pre req : Typecasting in Java 



import java.util.*;

public class myfirstprogram {
      public static void main(String[]  args) {
    	  
    	  System.out.println("Hello World");
    	  
    	  List<String> list = Arrays.asList("A", "B", "C");

          Object[] objArr = list.toArray();             // runtime type: Object[]
          System.out.println(objArr.getClass().getName()); // prints: [Ljava.lang.Object;
                  
          System.out.println(objArr.toString());
         
          System.out.println(Arrays.toString(objArr));
          
          for (Object o : objArr) {
        	    System.out.println(o); // prints: A B C
        	}

         // Dangerous cast:
//        String[] strArr = (String[]) objArr;          // ❌ ClassCastException
    
// list.toArray() always returns an array whose runtime type is Object[].
// Even if the list holds only Strings, the returned array is still an Object[] object, not a String[].
// Casting that Object[] to String[] fails at runtime (ClassCastException) unless the array really is a String[].
// Even though every element is a String, the array object itself is Object[], so the downcast fails.
          
         // When a cast would work (rare case)
    //     If the underlying array object actually is a String[], the cast works:
          
          // Created as String[] (runtime type is String[])
          String[] realStringArray = new String[] {"A", "B"};
          Object[] upcast = realStringArray;            // OK: arrays are covariant

          // Downcasting back is safe because the object truly is a String[]
          String[] back = (String[]) upcast;            // ✅ OK
          
          
          
    	  
      }
}



