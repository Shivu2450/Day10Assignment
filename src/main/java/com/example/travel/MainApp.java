package com.example.travel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TravelBookingService bookingService = context.getBean(TravelBookingService.class);

		bookingService.bookTravel("flight", "Delhi");
		bookingService.bookTravel("train", "Mumbai");

		// ((AbstractApplicationContext) context).close();
	}
}
