package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeatTest {

	@Test
	public void testSeat() {
		Seat seat1 = new Seat();
		assertEquals(999,seat1.getSeatNumber());
	}
	
	@Test
	public void testSetSeat() {
		Seat seat2 = new Seat();
		seat2.setSeatNumber(1);
		assertEquals(1,seat2.getSeatNumber());
	}

}
