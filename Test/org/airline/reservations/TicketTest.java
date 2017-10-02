package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketTest {

	@Test
	public void testSetPassenger() {
		Ticket ticket1 = new Ticket();
		Passenger testPassenger1 = new Passenger("Max");
		ticket1.setPassenger(testPassenger1);
		assertEquals("Max",ticket1.getPassenger().getName());
	}
	
	@Test
	public void testSetSeat() {
		Ticket ticket1 = new Ticket();
		Seat testSeat1 = new Seat(1);
		ticket1.setSeat(testSeat1);
		assertEquals(1,ticket1.getSeat().getSeatNumber());
	}
	
	@Test
	public void testSetFlight() {
		Ticket ticket1 = new Ticket();
		Flight testFlight1 = new Flight("Leeds","London",1);
		ticket1.setFlight(testFlight1);
		assertEquals("Leeds",ticket1.getFlight().getDepartureCity());
		assertEquals("London",ticket1.getFlight().getArrivalCity());
		assertEquals(1,ticket1.getFlight().getFlightNumber());
	}	

}
