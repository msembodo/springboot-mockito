package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessTest {

	@Test
	void calculateSum_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new int[] {1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void calculateSum_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new int[] {});
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void calculateSum_one() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new int[] {3});
		int expectedResult = 3;
		assertEquals(expectedResult, actualResult);
	}

}
