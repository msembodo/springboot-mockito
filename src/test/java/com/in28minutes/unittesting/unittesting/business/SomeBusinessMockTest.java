package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockTest {
	
	@InjectMocks SomeBusinessImpl business;
	
	@Mock SomeDataService dataServiceMock;

	@Test
	void calculateSumUsingDataService_basic() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, business.calculateSumUsingDataService());
	}
	
	@Test
	void calculateSumUsingDataService_empty() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(0, business.calculateSumUsingDataService());
	}
	
	@Test
	void calculateSumUsingDataService_one() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
		assertEquals(5, business.calculateSumUsingDataService());
	}

}
