package com.example.travel;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	@Bean
	public FlightBooking flightBooking() {
		return new FlightBooking();

	}

	@Bean
	public TrainBooking trainBooking() {
		return new TrainBooking();
	}

	@Bean
	public TravelBookingService trainBookingService() {
		return new TravelBookingService(flightBooking(), trainBooking());
	}
}
