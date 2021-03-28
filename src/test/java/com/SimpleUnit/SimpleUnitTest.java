package com.SimpleUnit;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

class SimpleClass {
	
	public int sum(int[] numbers) {
		
		int sum = 0;

		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}

		return sum;
	}
}


public class SimpleUnitTest {
	
	@Test
	public void testFor1Elements() {

		//Execute the Code
		SimpleClass simpleClass = new SimpleClass();

		int actualResult = simpleClass.sum( new int[] {12});

		//Check the Output
		int expectedResult = 45;

		//check expectedResult is equal to actualResult
		assertEquals(expectedResult, actualResult);


		//No checks
		//Checks
		//Absence of Failure is Success
	}
	
	@Test
	public void testFor2Elements() {

		//Execute the Code
		SimpleClass simpleClass = new SimpleClass();

		int actualResult = simpleClass.sum( new int[] {12, 15});

		//Check the Output
		int expectedResult = 28;

		//check expectedResult is equal to actualResult
		assertEquals(expectedResult, actualResult);


		//No checks
		//Checks
		//Absence of Failure is Success
	}
	
	@Test
	public void testFor5Elements() {

		//Execute the Code
		SimpleClass simpleClass = new SimpleClass();

		int actualResult = simpleClass.sum( new int[] {2, 6, 8, 15, 18});

		//Check the Output
		int expectedResult = 49;

		//check expectedResult is equal to actualResult
		assertEquals(expectedResult, actualResult);


		//No checks
		//Checks
		//Absence of Failure is Success
	}
	
	@Test
	public void testFor6Elements() {

		//Execute the Code
		SimpleClass simpleClass = new SimpleClass();

		int actualResult = simpleClass.sum( new int[] {2, 6, 8, 15, 18,50});

		//Check the Output
		int expectedResult = 99;

		//check expectedResult is equal to actualResult
		assertEquals(expectedResult, actualResult);


		//No checks
		//Checks
		//Absence of Failure is Success
	}

	@Test
	public void testFor0Elements() {

		//Execute the Code
		SimpleClass simpleClass = new SimpleClass();

		int actualResult = simpleClass.sum( new int[] {});

		//Check the Output
		int expectedResult = 0;

		//check expectedResult is equal to actualResult
		assertEquals(expectedResult, actualResult);


		//No checks
		//Checks
		//Absence of Failure is Success
	}

	
	
}
