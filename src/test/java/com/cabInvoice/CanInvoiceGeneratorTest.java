package com.cabInvoice;
import org.junit.Test;

import com.cabInvoice.entity.Ride;
import static org.junit.Assert.assertEquals;

public class CanInvoiceGeneratorTest {
	
	CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
	
	@Test
	public void testCalculateFare() {
		//  10Rs/km  &  1Rs/min
		
		int fare = invoiceGenerator.getFare(10, 30);
		assertEquals(130,fare);
	}
	
	@Test
	public void testMinFare() {
		int fare = invoiceGenerator.getFare(0, 3);
		assertEquals(5,fare);
		
	}
	
	@Test
	public void testMultipleRides() {
		
		Ride[] rides = {new Ride(10, 40), new Ride(20, 50)};
		// 140 + 250 = 390
		int totalFare = invoiceGenerator.getFare(rides);
		assertEquals(390,totalFare);		
		}
	}
	
