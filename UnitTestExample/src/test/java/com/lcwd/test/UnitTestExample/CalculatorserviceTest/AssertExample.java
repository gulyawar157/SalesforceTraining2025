package com.lcwd.test.UnitTestExample.CalculatorserviceTest;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AssertExample {
	
	@Test
	public void test1(){
		   System.out.println("Testing Some Assertions Methods : ");
		   
//		   byte expected = 12;
//		   byte actual = 12;
		   
//		   double expected = 12;
//		   double actual = 12;

//		   float expected = 12;
//		   Float actual = 12.0f;
		   
		   //overloaded
//		   Assertions.assertEquals(expected, actual);
		   
		   
//		   int[] actualarray = {2, 3,4,5};
//		   int[] expectedarray = {2, 3,4,5};
//		   
//		   Assertions.assertArrayEquals(expectedarray, actualarray);
		   
		   String name = new String("Mohan");
		   String expectedname = new String("Mohan");
		   
//		   Assertions.assertSame(name, expectedname);  it gives error because it checks the object
		   
//		   Assertions.assertEquals(name, expectedname);   // it run good
		   
		   
//		   String actualname = "Mohit";
//		   String expname = "Mohit";
//		   Assertions.assertSame(actualname, expname); 
		   
//		   Assertions.assertNull();
//		   Assertions.assertNotNull();

		   
//		   boolean val = false;
//		   Assertions.assertTrue(val);
		   
//		   List<Integer>  list1 = Arrays.asList(1,2,3,4,5);
//		   List<Integer>  list2 = Arrays.asList(1,2,3,4,5);
//		   
//		   Assertions.assertIterableEquals(list1, list2);
		   
		   
		   Assertions.assertThrows(RuntimeException.class, ()->{
//			   System.out.println("TThis is a testing Exception ");
			  throw new RuntimeException("This is a testing Exception");
		   } );
	}

	public static void main(String[] args) {
	

	}

}
