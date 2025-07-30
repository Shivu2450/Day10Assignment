package com.example.travel;

import org.springframework.stereotype.Component;

@Component
public class TrainBooking {
	public void book(String designation) {
		System.out.println("Train booked to: " + designation);
	}
}
