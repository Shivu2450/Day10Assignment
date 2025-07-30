package com.example.travel;

public class TravelBookingService {
	private final FlightBooking flightBooking;
	private final TrainBooking trainBooking;

	public TravelBookingService(FlightBooking flightBooking, TrainBooking trainBooking) {
		this.flightBooking = flightBooking;
		this.trainBooking = trainBooking;
	}

	public void bookTravel(String mode, String destination) {
		if ("flight".equalsIgnoreCase(mode)) {
			flightBooking.book(destination);
		} else if ("train".equalsIgnoreCase(mode)) {
			trainBooking.book(destination);
		} else {
			System.out.println("Invalid mode of travel");
		}
	}
}
