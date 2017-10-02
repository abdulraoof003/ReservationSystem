package org.airline.reservations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

	public static void main(String[] args) throws IOException {
		// initialise database
		Database prodDB = new Database();
		prodDB.bootstrap();

		// initialise console
		
		boolean always = true;
		BufferedReader screenInput = new BufferedReader(new InputStreamReader(System.in));
				
		// loop
		
		while(always){
			// ask for passengerName and add
			System.out.println("Enter passenger: ");
			String passengerName = screenInput.readLine();
			boolean result = prodDB.addPassenger(passengerName);
			if(result) {
				System.out.println("Welcome back");
			} else {
				System.out.println("Welcome");
			}
			
			
			always = false;
			// show flights and ask for flight
			// show available seats and ask
			// create ticket and return info
		}

	}

}
