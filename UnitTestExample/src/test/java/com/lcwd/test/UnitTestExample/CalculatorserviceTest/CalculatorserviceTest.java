package com.lcwd.test.UnitTestExample.CalculatorserviceTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lcwd.test.UnitTestExample.services.Calculatorservice;

public class CalculatorserviceTest {
	
	@BeforeAll
	public static void init() {
		System.out.println("This is a single time logic ");
	}
	
	@AfterAll
	public static void cleanup() {
		System.out.println("After all test logic ");
	}
	
	@BeforeEach
	public  void beforetestcase() {
		System.out.println("Before Each ");
	}
	
	@AfterEach
	public  void aftertestcase() {
		System.out.println("After Each ");
	}
	
	
	
	
	@Test
	public void addTwoNumbersTest() {
		System.out.println("This is a first test case  ");
		int actualresult = Calculatorservice.addTwoNumbers(12, 15);
		int expectedresult = 27;
		
		Assertions.assertEquals(expectedresult, actualresult, "Test Failed ");
	
		
		
	}

	@Test
	 public void sumAnyNumbersTest() {
		
		System.out.println("This is a second test case  ");
			int actualresult = Calculatorservice.sumAnyNumbers(12, 15, 23);
			int expectedresult = 50;
			
			Assertions.assertEquals(expectedresult, actualresult, "Test Failed ");
		
			
	}
	
//	
//	@Tag
//	@Nested
//	@TestFactory
//	@Disabled
//	@DisplayName
//	
	 


}
