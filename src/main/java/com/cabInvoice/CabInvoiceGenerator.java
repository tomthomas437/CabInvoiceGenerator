package com.cabInvoice;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import com.cabInvoice.entity.Invoice;
import com.cabInvoice.entity.Ride;

public class CabInvoiceGenerator {
	
	public static final int CostPerKM = 10;
	public static final int CostPerMin = 1;
	

	public int getFare(int distance, int time) {
		int fare = distance*CostPerKM + time*CostPerMin;
		if(fare<5) {
			return 5;
		}
		return fare;
	}

	public Invoice getFare(Ride[] rides) {
		int totalFare = 0;
		for(int i = 0;i< rides.length; i++) {
			Ride ride = rides[i];
			int fare = ride.getDistance() * CostPerKM + ride.getTime() * CostPerMin;
 
			totalFare += fare;			
		} return new Invoice(rides.length, totalFare, totalFare / rides.length);
	}

	public Invoice getFare(int i, HashMap<Integer, Ride[]> rideRepos) {

		for (Map.Entry<Integer, Ride[]> rideEntry : rideRepos.entrySet()) {
			if (rideEntry.getKey() == i)
				return getFare(rideEntry.getValue());
		}

		return null;
	}
}
