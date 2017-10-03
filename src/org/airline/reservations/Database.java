package org.airline.reservations;

import java.time.LocalDate;
import java.util.ArrayList;

public class Database {

	private ArrayList<Seat> seats;
	private ArrayList<Flight> flights;
	private ArrayList<Passenger> passengers;
	private ArrayList<Ticket> tickets;

	public Database() {
		seats = new ArrayList<Seat>();
		flights = new ArrayList<Flight>();
		passengers = new ArrayList<Passenger>();
		tickets = new ArrayList<Ticket>();
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public ArrayList<Flight> getFlights() {
		return flights;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void addSeat(int seatNumber) {
		seats.add(new Seat(seatNumber));

	}

	public void addFlight(String departureCity, String arrivalCity, int flightNumber) {
		flights.add(new Flight(departureCity, arrivalCity, flightNumber));

	}

	public boolean addPassenger(String passengerName) {
		boolean passengerExists = false;
		System.out.println("name to be added " + passengerName);
		
		if (getPassengers().size() == 0) {
			passengers.add(new Passenger(passengerName));
		} else {
			for (Passenger item : getPassengers()) {
	
				if (passengerName.equals(item.getName())) {
					passengerExists = true;
				}
				if (passengerExists == false) {
					passengers.add(new Passenger(passengerName));
				}
			}
		}
		System.out.println("Checked passenger exists " + passengerExists);
		return passengerExists;

	}

	public String addTicket(LocalDate departureDate, String name, int flightNumber, int seatNumber) {

		// find the passenger object
		Passenger ticketPassenger = null;
		for (Passenger item : getPassengers()) {
			if (name.equals(item.getName())) {
				ticketPassenger = item;
			}
		}

		// find the flight object
		Flight ticketFlight = null;
		for (Flight item : getFlights()) {
			if (flightNumber == item.getFlightNumber()) {
				ticketFlight = item;
			}
		}

		// find seat object
		Seat ticketSeat = null;
		for (Seat item : getSeats()) {
			if (seatNumber == item.getSeatNumber()) {
				ticketSeat = item;
			}
		}

		Ticket tempTicket = new Ticket();
		tempTicket.setDepartureDate(departureDate);
		tempTicket.setPassenger(ticketPassenger);
		tempTicket.setFlight(ticketFlight);
		tempTicket.setSeat(ticketSeat);
		tickets.add(tempTicket);
		return tempTicket.toString();

	}

	public ArrayList<Seat> getOpenSeats(LocalDate departureDate, int flightNumber) {
		ArrayList<Seat> openSeats = getSeats();
		for (Ticket item : getTickets()) {
			if (departureDate.equals(item.getDepartureDate()) && flightNumber == item.getFlight().getFlightNumber()) {
				openSeats.remove(item.getSeat());
			}

		}
		return openSeats;
	}

	public void bootstrap() {
		
		//addPassenger("Matt");
		
		addSeat(1);
		addSeat(2);
		addSeat(3);
		addSeat(4);
		addSeat(5);
		addSeat(6);

		addFlight("Los Angeles", "Chicago", 1000);
		addFlight("Chicago", "New York", 1010);
		addFlight("New York", "Chicago", 2000);
		addFlight("Chicago", "Los Angeles", 2010);
	}

}
