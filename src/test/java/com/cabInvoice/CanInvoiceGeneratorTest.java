package com.cabInvoice;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;

import com.cabInvoice.entity.Invoice;
import com.cabInvoice.entity.Ride;
import com.cabInvoice.entity.RideRepository;
import static org.junit.Assert.assertEquals;

public class CanInvoiceGeneratorTest {
	
	CabInvoiceGenerator invoiceGenerator;
	RideRepository rideRepository = new RideRepository();
	HashMap<Integer, Ride[]> rideRepos;
	
	@Before
	public void initialization() {
		invoiceGenerator = new CabInvoiceGenerator();
		rideRepos = rideRepository.getRideRepos();
	}
	
	
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
	public void testEnhancedInvoice() {
		
		Ride[] rides = {new Ride(10, 40), new Ride(20, 50)};
		// 140 + 250 = 390
		Invoice invoice = new Invoice(2,390,195);
		Invoice totalFare = invoiceGenerator.getFare(rides);
		assertEquals(invoice,totalFare);		
		}
	
	@Test
	public void testInvoiceService() {

		Ride[] rides1 = { new Ride(10, 40), new Ride(20, 50) };
		Ride[] rides2 = { new Ride(5, 3), new Ride(40, 60), new Ride(60, 80) };
		Ride[] rides3 = { new Ride(30, 60), new Ride(70, 90) };

		rideRepos.put(1, rides1);
		rideRepos.put(2, rides2);
		rideRepos.put(3, rides3);

		Invoice invoice = new Invoice(2, 390, 195);

		assertEquals(invoice, invoiceGenerator.getFare(1, rideRepos));
	}
	
	}
	
