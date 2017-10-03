package org.airline.reservations;

public class Passenger {

	//fields
	private String passengerName;
	
	//constructor
	public Passenger() {
		passengerName = "Unknown name";
	}
	
	
	public Passenger(String passengerName) {
		this.passengerName = passengerName;
	}

	//getters and setters

	public String getName() {
		return passengerName;
	}

	public void setName(String passengerName) {
		this.passengerName = passengerName;
	}
	
	public String toString() {
		return "Passenger: " + this.getName();
		
	}
}
