package mynewpack;


import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class C2_setspart2 {

	public static void main(String[] args) {
		// CopyOnWriteArraySet
		// Thread Safe 
		// Copy on write Mechanism  --when adding or removing a new copy of array is created (Study in detail)
		//No duplicate Elements 
		//Iterators do not reflect modifications -- it modifies while reading but on the copy and after iteration --- purani = new
		
		
		CopyOnWriteArraySet<Integer> cowSet = new CopyOnWriteArraySet<Integer>();
		ConcurrentSkipListSet<Integer> cslSet = new ConcurrentSkipListSet<Integer>();
		
		for(int i = 1; i<=5; i++) {
			cowSet.add(i);
			cslSet.add(i);
		}
		
		
		System.out.println("Initial Copy on Write Array Set : " + cowSet );
		System.out.println("InitialConcurrentSkipListSet : " + cslSet );
		
		System.out.println("Iterating and modifying CopyOnWriteArraySet : ");
		for(Integer num : cowSet) {
			System.out.println( "Reading from CopyOnWriteArraySet : " + num);
			
			cowSet.add(6);
			
		}
		
		System.out.println( cowSet);
		
		
		System.out.println("Iterating and modifying ConcurrentSkipListSet : ");
		for(Integer num : cslSet) {
			System.out.println( "Reading from ConcurrentSkipListSet : " + num);
			
			if(num ==5)  cslSet.add(7);
			
		}
	
			System.out.println( cslSet);
		
		// usage -- for more writes -- we cannot cowSet because new copy is made on every write , which increase memory consumption 
			// if read intensive task is there then we can use it .
			
			// for frequent read and write we can use concurrent skip list set 


	}

}
