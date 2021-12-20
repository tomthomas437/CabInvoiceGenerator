package com.cabInvoice;

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

}
