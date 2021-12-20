package com.cabInvoice.entity;

public class Ride {
	
	public int distance;
	public int time;
	
	
	public Ride(int distance, int time) {
		super();
		this.distance = distance;
		this.time = time;
	}

	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}



	}
	
