package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlightTest {

	@Test
	public void testFlight() {
		Flight testFlight1 = new Flight();
		assertEquals("Unknown Departure City",testFlight1.getDepartureCity());
		assertEquals("Unknown Arrival City",testFlight1.getArrivalCity());
		assertEquals(999,testFlight1.getFlightNumber());
	}

}
