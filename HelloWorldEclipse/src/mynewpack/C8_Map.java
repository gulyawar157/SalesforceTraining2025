package mynewpack;
import java.util.*;
public class C8_Map {

	public static void main(String[] args) {
		HashMap <Integer, String> map = new HashMap<>();
		
		map.put(15, "Nakul");
		map.put(7, "Bob");
		map.put(11, "Tom");
		map.put(7, "CR7");
		
	
		
		 System.out.println(map);
		 
		 String myfrnd = map.get(7);
		 System.out.println(myfrnd);
		 String myfrnd2 = map.get(9);
		 System.out.println(myfrnd2);
		
		 System.out.println(map.containsKey(11));
		 System.out.println(map.containsValue("Tom"));

//		 Set<Integer> integers = map.keySet();
//		 for(int x : integers) {
//			 System.out.println(x + " : " + map.get(x));
//		 }
		 
		 
		 for(int x : map.keySet()) {
			 System.out.println(x + " : " + map.get(x));
		 }
		 
		 Set<Map.Entry<Integer, String>> entries = map.entrySet();
		 
		 for(Map.Entry<Integer, String> entry : entries) {
			 System.out.println(entry.getKey()+ " "+ entry.getValue());
			 entry.setValue(entry.getValue().toUpperCase());
			 System.out.println(entry.getKey()+ " "+ entry.getValue());
		 }
		 
		 map.remove(7);
		 System.out.println(map);
		 
		 boolean res = map.remove(11, "David");
		 System.out.println("Removed : " + res);
		 
		 System.out.println(map);
		 
		 List<Integer> list = Arrays.asList(2,3,4,11,44,23,45,28);
		 System.out.println(list.contains(23));  // O(n) time complexity by linear search , map searching - O(1)
		 
		 
		 HashMap <Integer, String> map1 = new HashMap<>(19,0.8f);
		 
		 
	}

}
