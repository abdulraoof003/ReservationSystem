package org.airline.reservations;

public class Flight {
	private String departureCity;
	private String arrivalCity;
	private int flightNumber;

	public Flight() {
		this.departureCity = "Unknown Departure City";
		this.arrivalCity = "Unknown Arrival City";
		this.flightNumber = 999;
	}

	public Flight(String departureCity, String arrivalCity, int flightNumber) {
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.flightNumber = flightNumber;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String toString() {
		return "Flight Number: " + this.getFlightNumber() + " Departure City " + this.getDepartureCity()
				+ " Arrival City: " + this.getArrivalCity();

	}

}
