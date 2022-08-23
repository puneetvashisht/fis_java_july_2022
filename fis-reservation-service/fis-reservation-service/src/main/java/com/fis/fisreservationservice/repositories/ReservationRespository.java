package com.fis.fisreservationservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.fisreservationservice.entities.Reservation;

public interface ReservationRespository extends JpaRepository<Reservation, Integer>{
	public Reservation findBySourceAndDestination(String source, String destination);

}
