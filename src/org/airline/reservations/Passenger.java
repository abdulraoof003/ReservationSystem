package org.airline.reservations;

public class Passenger {

	//fields
	private String name;
	
	//constructor
	public Passenger() {
		name = "Unknown name";
	}
	
	
	public Passenger(String name) {
		this.name = name;
	}

	//getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Passenger: " + this.getName();
		
	}
}
