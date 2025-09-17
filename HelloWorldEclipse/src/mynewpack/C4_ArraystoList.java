package mynewpack;
import java.util.*;
import java.util.stream.Collectors;

public class C4_ArraystoList {

	public static void main(String[] args) {
		String buff[] = {"Vehicle", "Car", "Bike"};
        LinkedList <String> list1  = new   LinkedList <String>(Arrays.asList(buff));
        
        list1.add("Taxi");
        list1.add("Truck");
        
        System.out.println(list1);
        
        //convert back to array 
       String[] newstr1 = list1.toArray(new String[list1.size()]);
        
        for(String x : newstr1) {
        	System.out.println(x);
        }
        
//        https://www.softwaretestinghelp.com/convert-list-to-array-in-java/
        //1. Convert List To String
        
       // 1.1 Using The toString Method
        List<Character> list2 = Arrays.asList('H', 'e', 'l', 'l', 'o');
        System.out.println(list2);
        
        String res = list2.toString();
        res = res.substring(1, 3*list2.size()-1).replaceAll(", ", "");
        System.out.println("After removing the delimeters : " + res);
        
        // 1.2 Using Collectors Class
        //1.3 Using StringBuilder Class
        
        
        // 2. Convert List To An Array 
        
        //2.1 Using toArray()
        //create and initialize list
        List<String> strList = new LinkedList<String>(); 
        strList.add("This"); 
        strList.add("is"); 
        strList.add("Java"); 
        strList.add("Tutorial");
        System.out.println("The given list:" + strList);
 
       String[] strArray = strList.toArray(new String[0]); 
 
        System.out.println("The Array from List: ");
        for (String val : strArray) 
              System.out.print(val + " "); 
        
        
        System.out.print("\n");
       //2.2 Using Java 8 Stream
       // 2.3 Using get Method
        
        
        // 3. Convert Array To List
        
        //3.1 #1) Using asList() Method Java Code
        Integer[] oddArray = { 1,3,5,7,9,11 };
        //declare a list and use asList method to assign the array to list
        List<Integer> oddList = Arrays.asList(oddArray);

        System.out.println("List from array: " + oddList); 
        
        //3.2 Using plain Java Code
        //3.3  Using Collection.addAll() Method
        // 3.4 Using Java 8 Stream
        
        // 4. Converting list to set
        //4.1 Using The Traditional Method
        //4.2 Using HashSet or tree-set Constructor
        // 4.3 Using The addAll Method
        //4.4 Using Java 8 Streams
        
        //5. Convert Set To List
        // 5.1 Using plain Java
        // 5.2  Using Constructors
       // 5.3 Using The addAll Method
        // 5.4 Using Java 8 Stream

	}

}

//
//// 1.2 Using Collectors Class
//List<Character> strList = Arrays.asList('W', 'o', 'r', 'l','d'); 
//
//// convert list to string using collect and joining() method 
//String string=  strList.stream().map(String::valueOf).collect(Collectors.joining()); 
//
//// print string 
//System.out.println("List converted to string:" + string);
//
////1.3 Using StringBuilder Class
//List<Character> list3 =  
//       Arrays.asList('I', 'n', 'd', 'i', 'a'); 
//   object of stringBuilder
//   StringBuilder sb = new StringBuilder(); 
// use append method to append list element to StringBuilder object  
//for (Character ch : list3) { 
//    sb.append(ch); 
//} 
//
//// convert StringBuilder object to string using toString()
//String str_res = sb.toString(); 
//// print string 
//System.out.println("List converted to string: " + str_res); 