package com.cabInvoice.entity;
import java.util.HashMap;

public class RideRepository {
	HashMap<Integer, Ride[]> rideRepos = new HashMap<Integer, Ride[]>();

	public HashMap<Integer, Ride[]> getRideRepos() {
		return rideRepos;
	}

}
