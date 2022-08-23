package com.fis.fisreservationbookinservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;





@RestController
@RequestMapping("/reservation-booking-service")
public class ReservationBookingController {
	
	@GetMapping("/from/{source}/to/{dest}/quantity/{quantity}")
	public ResponseEntity<ReservationBean> fetchReservationsSourceToDestination(@PathVariable("source") String source, @PathVariable("dest") String dest, @PathVariable("quantity") int quantity){
		
		System.out.println("Source: " + source);
		System.out.println("dest: " + dest);
		System.out.println("quantity: " + quantity);
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("source", source);
		uriVariables.put("dest", dest);
		
		// Call the reservation service
		ResponseEntity<ReservationBean> reservationBean = new RestTemplate().getForEntity("http://localhost:8000/reservation-service/from/{source}/to/{dest}", ReservationBean.class, uriVariables );
		System.out.println(reservationBean);
		// Quantity * Price from reservation service
		ReservationBean body = reservationBean.getBody();
		body.setTotalPrice(body.getPrice() * quantity);	
		System.out.println(body);
		
		return new ResponseEntity<>(body, HttpStatus.OK);
	}

}
