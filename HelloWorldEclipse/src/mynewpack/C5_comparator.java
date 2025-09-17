package mynewpack;
import java.util.*;

class Mycomparator implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2) { 
		return o2-o1;
	}
}

class MyStringcomp implements Comparator<String>{
	public int compare(String o1, String o2) { 
		System.out.println(o1 + " "+ o2);
		return o1.length() - o2.length();
	}
}

public class C5_comparator {

	public static void main(String[] args) {
	    
		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(4);
		list.add(45);
		
		list.sort(new Mycomparator());
		
		System.out.println(list);
		
		List<String> words = Arrays.asList("Banana", "Pumkin", "Peach", "Date");
		words.sort(new MyStringcomp());
		System.out.println(words);
		
		// lambda expression
		List<String>names = Arrays.asList("Tom", "Alex", "Charlie", "Evans");
		names.sort((a,b) -> b.length() - a.length());
		System.out.println(names);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(9);
		list2.add(4);
		list2.add(45);
		
		list2.sort((a,b) -> b-a);
		System.out.println(list2);
	}

}
