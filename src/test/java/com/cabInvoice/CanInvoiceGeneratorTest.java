package com.cabInvoice;
import org.junit.Test;
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
	
}
