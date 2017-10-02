package org.airline.reservations;

public class Seat {
	private int seatNumber;

	public Seat() {
		seatNumber = 999;
	}

	public Seat(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

}
