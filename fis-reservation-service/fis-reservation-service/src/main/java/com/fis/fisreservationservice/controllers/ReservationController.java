package com.fis.fisreservationservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.fisreservationservice.entities.Reservation;
import com.fis.fisreservationservice.repositories.ReservationRespository;

@RestController
@RequestMapping("/reservation-service")
public class ReservationController {
	
	@Autowired
	ReservationRespository reservationRespository;
	
	@GetMapping("/")
	public ResponseEntity<List<Reservation>> fetchAllReservations(){
		List<Reservation> reservations = reservationRespository.findAll();
		return new ResponseEntity<>(reservations, HttpStatus.OK);
	}
	@GetMapping("/from/{source}/to/{dest}")
	public ResponseEntity<Reservation> fetchReservationsSourceToDestination(@PathVariable("source") String source, @PathVariable("dest") String dest){
		Reservation reservation = reservationRespository.findBySourceAndDestination(source, dest);
		return new ResponseEntity<>(reservation, HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<Void> addReservation(@RequestBody Reservation reservation){
		reservationRespository.save(reservation);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
