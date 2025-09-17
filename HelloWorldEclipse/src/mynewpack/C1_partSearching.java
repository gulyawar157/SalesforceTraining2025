package mynewpack;
import java.util.*;


class Domain  
{  
    private int id;  
    private String url;  
    // Constructor  
    public Domain(int id, String url)  
    {  
        this.id = id;  
        this.url = url;  
    }  
    public Integer getId()  
    {  
        return Integer.valueOf(id);  
    }  
}  


public class C1_partSearching {

	public static void main(String[] args) {
		   ArrayList<String> arrlist = new ArrayList<String>();  
	          arrlist.add("A");  
	          arrlist.add("B");  
	          arrlist.add("C");  
	          arrlist.add("D");  
	          //Search the list for key 'D'  
	          int index = Collections.binarySearch(arrlist, "D");       
	          System.out.println("index 'D' is available at position: "+index); 
	          
	          
	          ArrayList<Integer> arrlist1 = new ArrayList<Integer>();  
	          arrlist1.add(10);  
	          arrlist1.add(-20);  
	          arrlist1.add(30);  
	          arrlist1.add(-40);  
	          arrlist1.add(50);  
	          //Print List  
	          Collections.sort(arrlist1);
	          System.out.println("Provided List are: "+arrlist1);  
	          
	          //Search the list for key '-20'  
	          int ind = Collections.binarySearch(arrlist1, -20);       
	          System.out.println("Index '-20' is available at position: "+ind);  
	          
	          
	          
	          //**********************************************************************
	          //Create a list  
	          List<Domain> list = new ArrayList<Domain>();  
	          list.add(new Domain(10, "www.JavaTpoint.com"));  
	          list.add(new Domain(30, "www.sssit.com"));  
	          list.add(new Domain(50, "www.hindi100.com"));  
	          list.add(new Domain(5, "www.english00.com"));
	          Comparator<Domain> c = new Comparator<Domain>()  
	          {  
	              public int compare(Domain u1, Domain u2)  
	              {  
	                  return u1.getId().compareTo(u2.getId());  
	              }  
	          };  
	          /* Searching a domain with key value 10. To search 
	          we create an object of domain with key 10. */  
	          
	       //   list.sort(c);
	          Collections.sort(list,c);
	          
	          int ind1 = Collections.binarySearch(list, new Domain(10, null), c);  
	          System.out.println("Available at index: " + ind1);  
	          //Searching an item with key 5  
	          ind1 = Collections.binarySearch(list, new Domain(30, null), c);  
	          System.out.println("Found at index: " +ind1);  
	       
	}

}
