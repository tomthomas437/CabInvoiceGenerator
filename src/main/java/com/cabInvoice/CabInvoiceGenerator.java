package com.cabInvoice;
import org.junit.Test;
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

	public int getFare(Ride[] rides) {
		int totalFare = 0;
		for(int i = 0;i< rides.length; i++) {
			Ride ride = rides[i];
			int fare = ride.getDistance() * CostPerKM + ride.getTime() * CostPerMin;
 
			totalFare += fare;			
		} return totalFare;
	}

}
